package stepDefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import CommonMethods.SpecificToSelenium;
import io.cucumber.java.en.*;
import pages.SeleniumTestExamplePage;
 
 
public class Page2 {
	private static WebDriver wd;
	@Given("user is in {string}")
	public void user_is_in(String homePage) {
	   SpecificToSelenium obj_SpecificToSelenium=new SpecificToSelenium();
	  wd=obj_SpecificToSelenium.setDriver();
	  Assert.assertEquals(wd.getTitle(),homePage);
	}

	@When("user enters {string} on Input Text Here textbox")
	public void user_enters_on_input_text_here_textbox(String text) {
	   SeleniumTestExamplePage obj_SeleniumTestExamplePage=new SeleniumTestExamplePage(wd);
	   obj_SeleniumTestExamplePage.sendDataOnFormELements(text);
	}

	@Then("system should display {string} in Input Text Here textbox")
	public void system_should_display_in_input_text_here_textbox(String string) {
	   
	}
}
