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

public class GraphicsOptionScreen extends BaseClass{
	static Logger logger= LogManager.getLogger(GraphicsOptionScreen.class);							//for logging
	public String text = "";
	public GraphicsOptionScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

//----------------------------------Test5 (animate drawables)--------------------------------------------
	@AndroidFindBy(accessibility="Graphics")
	public MobileElement Graphics;																	//graphics initialized
	
	@AndroidFindBy(accessibility="AnimateDrawables")
	public MobileElement AnimateDrawables;															//animate drawables initialized
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement Checkup5;																	//chechup5 initialized
	
	public void graphics(){																			//graphics method
		Graphics.click();																			//click function for clicking
		logger.info("graphics option choosed");
	}
	public void animateDrawables() {																//animate drawables method
		AnimateDrawables.click();																	//click function for clicking
		logger.info("animate drawables option choosed");
	}
	public String assertCheckUp5() {																//assert method
		text = Checkup5.getText();																	//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																				//returning text
	}

}
