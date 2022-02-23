package myHooks;

import org.openqa.selenium.WebDriver;

import CommonMethods.SpecificToSelenium;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	public static WebDriver driver;
	@Before
	public void openBrowserAndUrl() {
		SpecificToSelenium obj_SpecificToSelenium=new SpecificToSelenium();
		driver=obj_SpecificToSelenium.openUrl(obj_SpecificToSelenium.setDriver());
	}
	
	@After
	public void closeBrowser() {
		SpecificToSelenium obj_SpecificToSelenium=new SpecificToSelenium();
		obj_SpecificToSelenium.close(driver);
	}

}
