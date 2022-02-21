package CommonMethods;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import util.PropertyReader;

public class SpecificToSelenium {
	
	 
	private static Properties value;
	
	//constructor
	//to get values from property file
	public SpecificToSelenium() {
		PropertyReader obj_PropertyReader=new PropertyReader();
		value=obj_PropertyReader.propertyReader();
	}
	
	public WebDriver  setDriver() {
	
		WebDriver driver=null;
		
	if(value.getProperty("browser").equalsIgnoreCase("chrome")) {
		  ChromeOptions obj_ChromeOptions=new ChromeOptions();
		  obj_ChromeOptions.addArguments("InCognito");
		  obj_ChromeOptions.addArguments("start-maximized");
		  WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver(obj_ChromeOptions);
	  }
	  
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
}
