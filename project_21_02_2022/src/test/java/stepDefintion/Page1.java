package stepDefintion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import CommonMethods.SpecificToSelenium;
import io.cucumber.java.en.*;

public class Page1 {
	private static WebDriver wd;
	@Given("user is in {string} page")
	public void user_is_in_page(String homePage) {
		SpecificToSelenium obj_SpecificToSelenium=new SpecificToSelenium();
		wd=obj_SpecificToSelenium.setDriver();
		Assert.assertEquals(wd.getTitle(),homePage);
	}

	@When("user clicks on selenium Example page")
	public void user_clicks_on_selenium_example_page() {

	}

	@Then("system should open {string}")
	public void system_should_open(String string) {

	}


}
