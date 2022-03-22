
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

public class AnimationOptionScreen extends BaseClass{
	static Logger logger= LogManager.getLogger(AnimationOptionScreen.class);						//for logging
	public String text = "";
	public AnimationOptionScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

//----------------------------------Test3 (animation default layout)--------------------------------------------
	@AndroidFindBy(accessibility="Animation")
	public MobileElement Animation;																	//animation initialized
	
	@AndroidFindBy(accessibility="Default Layout Animations")
	public MobileElement DefaultLayoutAnimation;													//default layout animation initialized
	
	@AndroidFindBy(accessibility="Add Button")
	public MobileElement AddButton;																	//add button initialized
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.GridLayout/android.widget.Button")
	public MobileElement Checkup3;																	//checkup 3 initialized
	
	public void animation(){																		//animation method
		Animation.click();																			//click function for clicking
		logger.info("animation option choosed");
	}
	public void defaultLayoutAnimation() {															//default layout animation method
		DefaultLayoutAnimation.click();																//click function for clicking
		logger.info("default layout animation option choosed");
	}
	public void addButton() {																		//add button method
		AddButton.click();																			//click function for clicking
		logger.info("add button clicked");
	}
	public String assertCheckUp3() {																//assert method
		text = Checkup3.getText();																	//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																				//returning text
	}
}
