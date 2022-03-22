
package stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import main.BaseClass;
import screens.GraphicsOptionScreen;

public class GraphicsOption_StepDef extends BaseClass{

	GraphicsOptionScreen graphic = new GraphicsOptionScreen(driver);			//object created
	@When("^User choose option named as Graphics$")								//when statement
	public void user_choose_option_named_as_Graphics() {
		graphic.graphics();														//graphics method in screen
	}

	@When("^User click on Animate Drawables$")									//when statement
	public void user_click_on_Animate_Drawables() {
		graphic.animateDrawables();												//animate drawables method in screen
	}

	@Then("^User is directed to Drawables Screen$")								//then statement
	public void user_is_directed_to_Drawables_Screen() {
		String text = graphic.assertCheckUp5();									//inserting values in text after returning values from method
		Assert.assertEquals(text, "Graphics/AnimateDrawables");					//assertion
		System.out.println(text);
	}
}
