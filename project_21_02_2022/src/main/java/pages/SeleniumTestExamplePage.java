package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import CommonMethods.CommonMethods;
import CommonMethods.SpecificToSelenium;

public class SeleniumTestExamplePage {
	
	SpecificToSelenium obj_SpecificToSelenium=new SpecificToSelenium();
	
	public SeleniumTestExamplePage(WebDriver wd)
	{
		PageFactory.initElements(wd,this);

	}
//webelement identification
	@FindBy(xpath ="//body/div[1]/form[1]/input[1]" )
	WebElement enter_Data_On_Form_ELements;
	
	
	//page specific methods
	public void sendDataOnFormElements(String text) {
		obj_SpecificToSelenium.webElement_EnterText(enter_Data_On_Form_ELements, text);

	}
	
	public void getText_FormElements(String expText) {
		Assert.assertEquals(obj_SpecificToSelenium.getText_From_TextField(enter_Data_On_Form_ELements), expText); ;
	}

}
