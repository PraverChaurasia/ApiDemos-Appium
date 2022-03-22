package screens;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.BaseClass;

public class WrongAccessibilityOptionScreen extends BaseClass{

	static Logger logger= LogManager.getLogger(WrongAccessibilityOptionScreen.class);												//for logging
	public String text = "";
	public WrongAccessibilityOptionScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	//----------------------------------Test1 (accessibility services)--------------------------------------------
		
		@AndroidFindBy(accessibility="Accessibility Service")
		public MobileElement wAccessibilityServices;														//accessibility services initialized
		
		@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
		public MobileElement Checkup9;																	//checkup 1 initialized
		
		public void waccessibilityServices() {															//accessibility services method
			wAccessibilityServices.click();																//click function for clicking
			logger.info("accessibility services option choosed");										
		}
		public String wassertCheckUp9() {																//assert method
			text = Checkup9.getText();																	//getText function for getting text
			System.out.println(text);
			logger.info("checking for assertion");
			return text;																				//returning text
		}

}
