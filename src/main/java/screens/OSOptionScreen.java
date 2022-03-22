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

public class OSOptionScreen extends BaseClass{
	static Logger logger= LogManager.getLogger(OSOptionScreen.class);												//for logging
	public String text = "";
	public OSOptionScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

//----------------------------------Test7 (sms message)--------------------------------------------
	@AndroidFindBy(accessibility="OS")
	public MobileElement OS;																						//os initialized
	
	@AndroidFindBy(accessibility="SMS Messaging")
	public MobileElement SMSMessaging;																				//sms messaging initialized
	
	@AndroidFindBy(id="io.appium.android.apis:id/sms_recipient")
	public MobileElement RecipientBox;																				//recipient box initialized
	
	@AndroidFindBy(id="io.appium.android.apis:id/sms_content")	
	public MobileElement MessageBodyBox;																			//message body box initialized
	
	@AndroidFindBy(accessibility="Send")
	public MobileElement Send;																						//send initialized
	
	@AndroidFindBy(id="io.appium.android.apis:id/sms_status")
	public MobileElement Checkup7;																					//checkup 7 initialized
	
	public void os(){																								//os method 
		OS.click();																									//click function for clicking
		logger.info("os option choosed");
	}
	public void smsMessaging() {																					//sms messaging method
		SMSMessaging.click();																						//click function for clicking
		logger.info("sms messaging option choosed");
	}
	public void recipientBox(String number) {																		//recipient box method
		RecipientBox.sendKeys(number);																				//sendKeys function for sending keys
		logger.info("values sended to Recipient box");
	}
	public void messageBodyBox(String body) {																		//message body box method
		MessageBodyBox.sendKeys(body);																				//sendKeys function for sending keys
		logger.info("values sended to mssg body box");
	}
	public void send() {																							//send method
		Send.click();																								//click function for clicking
		logger.info("send button clicked");
	}
	public String assertCheckUp7() {																				//assert method
		text = Checkup7.getText();																					//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																								//returning text
	}


}
