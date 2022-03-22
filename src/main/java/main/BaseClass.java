package main;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {

	public static AppiumDriver<MobileElement> driver;
	public static AppiumDriverLocalService service;
	
	public static File file = new File ("./resources/config.properties");
	public static FileInputStream fis= null;
	public static Properties prop = new Properties();
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	//public static String screenshotDirectory = System.getProperty("user.dir") + "/report/screenshots/";
	static {
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	static Logger logger= LogManager.getLogger(BaseClass.class);	
	
	public void starting() {
		
		logger.info("Desire capabilities Initializing");											//logger log4j
	
		DesiredCapabilities capabilities = new DesiredCapabilities();	
		capabilities.setCapability("platformVersion","8.1");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("app","C:\\Users\\praverchaurasia\\eclipse-workspace\\testAppium\\app\\ApiDemos.apk");
		capabilities.setCapability("appPackage","io.appium.android.apis");
		capabilities.setCapability("appActivity",".ApiDemos");
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("isHeadless", true);
	
		//System.out.print("working");
		try {
			driver= new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}catch(Exception e)
		{
			e.printStackTrace();	}
	
		logger.info("Desired Capabilities Intialized");


	}
}
