package screens;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.BaseClass;

public class AccessibilityOptionScreen extends BaseClass{
	
	static Logger logger= LogManager.getLogger(AccessibilityOptionScreen.class);					//for logging	
	public String text = "";
	public AccessibilityOptionScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

//----------------------------------Test1 (accessibility services)--------------------------------------------
	@AndroidFindBy(accessibility="Accessibility")
	public MobileElement Accessibility;																//accessibility initialized
	
	@AndroidFindBy(accessibility="Accessibility Service")
	public MobileElement AccessibilityServices;														//accessibility services initialized
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement Checkup1;																	//checkup 1 initialized
	
	public void accessibility(){																	//accessibility method
		Accessibility.click();																		//click function for clicking
		logger.info("accessibility option choosed");
	}
	public void accessibilityServices() {															//accessibility services method
		AccessibilityServices.click();																//click function for clicking
		logger.info("accessibility services option choosed");										
	}
	public String assertCheckUp1() {																//assert method
		text = Checkup1.getText();																	//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																				//returning text
	}
	
//----------------------------------Test2 (accessibility node provider)--------------------------------------------
	@AndroidFindBy(accessibility="Accessibility Node Provider")
	public MobileElement AccessibilityNodeProvider;													//accessibility node proveider initialized
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement Checkup2;																	//checkup 2 initialized
	
	public void accessibilityNodeProvider() {
		AccessibilityNodeProvider.click();
		logger.info("accessibility node provider option choosed");
	}
	public String assertCheckUp2() {																//assert method
		text = Checkup2.getText();																	//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																				//returning text
	}
	
	
}
