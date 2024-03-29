package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.CommonMethods;
import CommonMethods.SpecificToSelenium;

public class HomePage {
	SpecificToSelenium obj_SpecificToSelenium=new SpecificToSelenium();
	
	public HomePage(WebDriver wd) {
		PageFactory.initElements(wd,this);

	}
	@FindBy(xpath ="//a[contains(text(),'Selenium Example Page')]")
	WebElement link_SeleniumExamplePage;

	public void link_Selenium_Example_Page() {
		obj_SpecificToSelenium.webElement_click(link_SeleniumExamplePage);

	}
}
