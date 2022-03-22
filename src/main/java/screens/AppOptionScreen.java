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

public class AppOptionScreen extends BaseClass{
	static Logger logger= LogManager.getLogger(AppOptionScreen.class);						//for logging
	public String text = "";
	public AppOptionScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

//----------------------------------Test4 (custom title)--------------------------------------------
	@AndroidFindBy(accessibility="App")
	public MobileElement App;																		//app initialized
	
	@AndroidFindBy(accessibility="Activity")
	public MobileElement Activity;																	//activity initialized
	
	@AndroidFindBy(accessibility="Custom Title")
	public MobileElement CustomTitle;																//custom title initialized
	
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"Left is best\"]")
	public MobileElement LeftTextBox;																//left text box initialized
	
	@AndroidFindBy(accessibility="Change Left")
	public MobileElement ChangeLeft;																//change left initialized
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Left is best\"]")
	public MobileElement Checkup4;																	//checkup 4 initialized
	
	public void app(){																				//app method
		App.click();																				//click function for clicking
		logger.info("app option choosed");
	}
	public void activity() {																		//activity method
		Activity.click();																			//click function for clicking
		logger.info("activity option choosed");
	}
	public void customTitle() {																		//custom title method
		CustomTitle.click();																		//click function for clicking
		logger.info("custom title option choosed");
	}
	public void leftTextBox(String Txt) {															//left text box method
		LeftTextBox.sendKeys(Txt);																	//sendKeys function for sending keys
		logger.info("values sended to left text box");
	}
	public void changeLeft() {																		//change left method
		ChangeLeft.click();																			//click function for clicking
		logger.info("change left button clicked");
	}
	public String assertCheckUp4() {																//assert method
		text = Checkup4.getText();																	//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																				//returning text
	}

}
