package stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import main.BaseClass;
import screens.NFCOptionScreen;

public class NFCOption_StepDef extends BaseClass{
	
	NFCOptionScreen nfc = new NFCOptionScreen(driver);						//creating object
	
	@When("^User choose option named as NFC$")								//when statement
	public void user_choose_option_named_as_NFC() {
		nfc.nfc();															//nfc method in screen
	}

	@When("^User click on ForegroundNdefPush$")								//when statement
	public void user_click_on_ForegroundNdefPush() {
		nfc.foregroundNdefPush();											//foreground ndef push method in screen
	}

	@Then("^User is directed to ForegroundNdefPush$")						//then statement
	public void user_is_directed_to_ForegroundNdefPush() {
		String text = nfc.assertCheckUp6();									//inserting values in text after returning values from method
		Assert.assertEquals(text, "NFC/ForegroundNdefPush");				//assertion
		System.out.println(text);
	}

}
