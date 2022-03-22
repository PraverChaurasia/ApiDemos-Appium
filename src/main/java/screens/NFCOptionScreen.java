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

public class NFCOptionScreen extends BaseClass{
	static Logger logger= LogManager.getLogger(NFCOptionScreen.class);											//for logging
	public String text = "";
	public NFCOptionScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

//----------------------------------Test6 (foreground ndef push)--------------------------------------------
	@AndroidFindBy(accessibility="NFC")
	public MobileElement NFC;																					//nfc initialized
	
	@AndroidFindBy(accessibility="ForegroundNdefPush")
	public MobileElement ForegroundNdefPush;																	//foreground ndef push initialized
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement Checkup6;																				//checkup6 initialized
	
	public void nfc(){																							//nfc method
		NFC.click();																							//click function for clicking
		logger.info("nfc option choosed");
	}
	public void foregroundNdefPush() {																			//foreground ndef push method
		ForegroundNdefPush.click();																				//click function for clicking
		logger.info("ForegroundNdefPush option choosed");
	}
	public String assertCheckUp6() {																			//assert method
		text = Checkup6.getText();																				//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																							//returning text
	}

}
