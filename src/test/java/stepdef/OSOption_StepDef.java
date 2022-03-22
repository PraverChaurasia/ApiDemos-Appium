package stepdef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import main.BaseClass;
import screens.OSOptionScreen;
import utils.ExcelReader;

public class OSOption_StepDef extends BaseClass{
	
	OSOptionScreen os = new OSOptionScreen (driver);
	ExcelReader obj = new ExcelReader();
	
	@When("^User choose os$")
	public void user_choose_os() {
		os.os();
	}

	@When("^User choose SMS Messaging$")
	public void user_choose_SMS_Messaging() {
		os.smsMessaging();
	}

	@When("^User fills data from excel data\"([^\"]*)\" and rownumber (\\d+) and click on send$")
	public void user_fills_data_from_excel_data_and_rownumber_and_click_on_send(String arg1, int arg2) throws InvalidFormatException, IOException {
		List<Map<String,String>> data = 
				obj.getData("C:\\Users\\praverchaurasia\\eclipse-workspace\\Testing_Exit_Assignment\\ExcelFiles\\OSOptionTestData.xlsx", arg1);
		String recipientboxdata = data.get(arg2).get("Recipient");
		String messagebodyboxdata = data.get(arg2).get("Message_Body");
		os.recipientBox(recipientboxdata);																	//left text box method in screen
		os.messageBodyBox(messagebodyboxdata);																//left text box method in screen
		os.send();																							//send methd in screen
	}

	@Then("^User can see message status$")
	public void user_can_see_message_status() {
		String text = os.assertCheckUp7();																	//inserting values in text after returning values from method
		Assert.assertEquals(text, "Message sent!");														//assertion
	}


}
