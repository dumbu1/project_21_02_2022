package CommonMethods;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import util.PropertyReader;

public class SpecificToSelenium {
	
	public static WebDriver driver=null;
	 
	private static Properties value;
	
	//constructor
	//to get values from property file
	public SpecificToSelenium() {
		PropertyReader obj_PropertyReader=new PropertyReader();
		value=obj_PropertyReader.propertyReader();
	}
	
	public WebDriver  setDriver() {
	
		
		
	if(value.getProperty("browser").equalsIgnoreCase("chrome")) {
		  ChromeOptions obj_ChromeOptions=new ChromeOptions();
		  obj_ChromeOptions.addArguments("InCognito");
		  obj_ChromeOptions.addArguments("start-maximized");
		  WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver(obj_ChromeOptions);
	  }
	  
	  return driver;
		}
	
	
	//to get browser
	public static WebDriver getDriver() {
		return driver;
	}


	//to open url
	public WebDriver openUrl(WebDriver driver) {
		driver.get(value.getProperty("url"));
		return driver;
	}

	//to close browser
	public void close(WebDriver driver) {
		driver.close();
	}
	
	
	
	
	
	public void webElement_click(WebElement webElement ) {
		if(webElement.isEnabled()) {
			webElement.click();
		}

	}
	public void webElement_EnterText(WebElement webElement, String text) {
		if(webElement.isEnabled()) {
			webElement.sendKeys(text);
		}
		
	}
	
	public String getText_From_TextField(WebElement webElement) {
		return webElement.getAttribute("value");
	}
}
