package stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import main.BaseClass;
import screens.TextOptionScreen;

public class TextOption_StepDef extends BaseClass{

	TextOptionScreen txt = new TextOptionScreen(driver);					//object created
	@When("^User choose option named as Text$")								//when statement
	public void user_choose_option_named_as_Text() {
		txt.text();															//text method in screen
	}

	@When("^User click on LogTextBox$")										//when statement
	public void user_click_on_LogTextBox() {
		txt.logTextBox();													//log text box method in screen
	}

	@When("^User click on Add$")											//when statement
	public void user_click_on_Add() {
		txt.add();															//add method in screen
	}

	@Then("^User can see line added in box$")								//then statement
	public void user_can_see_line_added_in_box() {
		String text = txt.assertCheckUp8();									//inserting values in text after returning values from method
		Assert.assertEquals(text, "This is a test\n");
	}

}
