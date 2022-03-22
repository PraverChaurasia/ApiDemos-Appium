package runner;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.service.local.AppiumDriverLocalService;

@CucumberOptions(
		features= {"src/test/java/features"},
		glue= {"stepdef","hooks"},
		strict= true,
		monochrome=true,
		tags= {"@test1,@test2,@test3,@test4,@test5,@test6,@test7,@test8,@test9"},
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:report/ExtentReport.html"},
		dryRun = false
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	static AppiumDriverLocalService service;
	static Logger logger= LogManager.getLogger(TestRunner.class);
	@BeforeSuite
	public void startAppiumAndsetExtent(){
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		System.out.print("Suite working");
	}	
	@AfterSuite
	public void stopAppium() {
		service.stop();
	}
	@AfterClass
	public static void reprt() {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	}

}
