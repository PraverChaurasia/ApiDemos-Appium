package stepdef;
import java.time.Duration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;
import main.BaseClass;
import screens.AccessibilityOptionScreen;

public class AccessibilityOption_StepDef extends BaseClass{
	
	
	AccessibilityOptionScreen acc = new AccessibilityOptionScreen(driver);		//object created

	
//------------------------------------Test1--------------------------------------
	@Given("^App is launched$")													//given statement
	public void app_is_launched() {
	}

	@When("^User choose option named as Accessibility$")						//when statement
	public void user_choose_option_named_as_Accessibility() {
		acc.accessibility();													//accessibility method in screen
	}

	@When("^User click on Accessibility services$")								//when statement
	public void user_click_on_Accessibility_services() {
		acc.accessibilityServices();											//accessibility services method in screen
	}

	@Then("^User is directed to accessibility services$")						//then statement
	public void user_is_directed_to_accessibility_services() {
		String text = acc.assertCheckUp1();										//inserting values in text after returning values from method
		Assert.assertEquals(text, "Accessibility/Accessibility Service");		//assertion
		System.out.println(text);
	}
	
//------------------------------------Test2--------------------------------------
	@When("^User click on Accessibility node provider$")						//when statement
	public void user_click_on_Accessibility_node_provider() {
		acc.accessibilityNodeProvider();										//accessibility services method in screen
	}

	@Then("^User is directed to accessibility node provider$")					//then statement
	public void user_is_directed_to_accessibility_node_provider() {
		String text = acc.assertCheckUp2();										//inserting values in text after returning values from method
		Assert.assertEquals(text, "Accessibility/Accessibility Node Provider");	//assertion
		System.out.println(text);
	}

}
