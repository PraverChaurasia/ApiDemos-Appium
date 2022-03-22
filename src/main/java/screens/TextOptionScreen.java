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

public class TextOptionScreen extends BaseClass{
	static Logger logger= LogManager.getLogger(TextOptionScreen.class);												//for logging
	public String text = "";
	public TextOptionScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

//----------------------------------Test8 (log text box)--------------------------------------------
	@AndroidFindBy(accessibility="Text")
	public MobileElement Text;																						//text initialized
	
	@AndroidFindBy(accessibility="LogTextBox")
	public MobileElement LogTextBox;																				//log text box initialized
	
	@AndroidFindBy(accessibility="Add")
	public MobileElement Add;																						//add initialized
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView")
	public MobileElement Checkup8;																					//checkup 8 initialized
	
	public void text(){																								//text method
		Text.click();																								//click function for clicking
		logger.info("nfc option choosed");
	}
	public void logTextBox() {																						//log text box method
		LogTextBox.click();																							//click function for clicking
		logger.info("LogTextBox option choosed");
	}
	public void add() {																								//add method
		Add.click();																								//click function for clicking
		logger.info("add button clicked");
	}
	public String assertCheckUp8() {																				//assert method
		text = Checkup8.getText();																					//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																								//returning text
	}

}
