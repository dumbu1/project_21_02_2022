package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.CommonMethods;

public class SeleniumTestExamplePage {
	CommonMethods obj_CommonMethods=new CommonMethods();
	public SeleniumTestExamplePage(WebDriver wd)
	{
		PageFactory.initElements(wd,this);

	}

	@FindBy(xpath ="//body/div[1]/form[1]/input[1]" )
	WebElement send_Data_On_Form_ELements;
	public void sendDataOnFormELements(String text) {
		obj_CommonMethods.sendDataOnIt(send_Data_On_Form_ELements, text); 

	}

}
