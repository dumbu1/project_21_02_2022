package stepDefintion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import CommonMethods.SpecificToSelenium;
import io.cucumber.java.en.*;
import pages.HomePage;

public class Page1 {
	
	@Given("user is in {string} page")
	public void user_is_in_page(String homePage) {
		Assert.assertEquals(SpecificToSelenium.getDriver().getTitle(),homePage);
	}

	@When("user clicks on selenium Example page")
	public void user_clicks_on_selenium_example_page() {
		HomePage obj_HomePage=new HomePage(SpecificToSelenium.getDriver());
		obj_HomePage.link_Selenium_Example_Page();
	}

	@Then("system should open {string}")
	public void system_should_open(String homePage) {
		Assert.assertEquals(SpecificToSelenium.getDriver().getTitle(),homePage);
	}


}
