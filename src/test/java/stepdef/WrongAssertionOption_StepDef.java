package stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import main.BaseClass;
import screens.AccessibilityOptionScreen;
import screens.WrongAccessibilityOptionScreen;

public class WrongAssertionOption_StepDef extends BaseClass {
	WrongAccessibilityOptionScreen wrong = new WrongAccessibilityOptionScreen(driver);
	
	@When("^User click on Accessibility services with wrong assertion$")
	public void user_click_on_Accessibility_services_with_wrong_assertion() {
		wrong.waccessibilityServices();
	}

	@Then("^User is directed to accessibility services but with wrong assertion$")
	public void user_is_directed_to_accessibility_services_but_with_wrong_assertion() {
		String text = wrong.wassertCheckUp9();																	//inserting values in text after returning values from method
		Assert.assertEquals(text, "Wrong Assertion");															//assertion
	}
}
