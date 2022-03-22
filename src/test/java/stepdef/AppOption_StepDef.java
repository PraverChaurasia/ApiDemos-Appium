package stepdef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import main.BaseClass;
import screens.AnimationOptionScreen;
import screens.AppOptionScreen;
import utils.ExcelReader;

public class AppOption_StepDef extends BaseClass{
	AppOptionScreen app = new AppOptionScreen(driver);												//screen object created
	ExcelReader obj = new ExcelReader();															//excel reader object created
	
	@When("^User choose app$")																		//when statement
	public void user_choose_app() {
		app.app();																					//app method in screen
	}

	@When("^User choose activity$")																	//when statement
	public void user_choose_activity() {
		app.activity();																				//activity method in screen
	}

	@When("^User choose custom title$")																//when statement
	public void user_choose_custom_title() {
		app.customTitle();																			//custom title method in screen
	}

	@When("^User fills form excel data\"([^\"]*)\" and rownumber (\\d+) and click on change left$")//when statement
	public void user_fills_form_excel_data_and_rownumber_and_click_on_change_left(String arg1, int arg2) throws InvalidFormatException, IOException {
		List<Map<String,String>> data = 
				obj.getData("C:\\Users\\praverchaurasia\\eclipse-workspace\\Testing_Exit_Assignment\\ExcelFiles\\AppOptionTestData.xlsx", arg1);
		String textboxdata = data.get(arg2).get("LeftTextBox");
		app.leftTextBox(textboxdata);																//left text box method in screen
		app.changeLeft();																			//change left method in screen
	}

	@Then("^User can see changes on left top corner$")												//then statement
	public void user_can_see_changes_on_left_top_corner() {
		String text = app.assertCheckUp4();															//inserting values in text after returning values from method
		String s1 = "Left is bestest";
		String s2 = "Left is bestbut";
		if(text.equalsIgnoreCase(s1)) {
			Assert.assertEquals(text, "Left is bestest");											//assertion
		}
		else if(text.equalsIgnoreCase(s2)) {
			Assert.assertEquals(text, "Left is bestbut");											//assertion
		}
		else {
			Assert.assertEquals(text, "...");														//assertion
		}
		System.out.println(text);
	}
}
