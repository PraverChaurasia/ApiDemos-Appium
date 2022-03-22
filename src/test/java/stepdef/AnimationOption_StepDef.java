package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import main.BaseClass;
import screens.AnimationOptionScreen;

public class AnimationOption_StepDef extends BaseClass{

	AnimationOptionScreen animate = new AnimationOptionScreen(driver);			//object created
	
	/*@Given("^App is launched$")
	public void app_is_launched() {
	}*/
	
	@When("^User choose option named as Animation$")							//when statement
	public void user_choose_option_named_as_Animation() {
		animate.animation();													//animation method in screen
	}

	@When("^User click on Default layout animation$")							//when statement
	public void user_click_on_Default_layout_animation() {
		animate.defaultLayoutAnimation();										//default layout animation method in screen
	}

	@When("^User click on add button$")											//when statement
	public void user_click_on_add_button() {
		animate.addButton();													//add button method in screen
	}

	@Then("^User can see a button$")											//then statement
	public void user_can_see_a_button() {
		String text = animate.assertCheckUp3();									//inserting values in text after returning values from method
		Assert.assertEquals(text, "1");											//assertion
		System.out.println(text);
	}

}
