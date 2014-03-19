package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	static String browser;
	static String URL;
	static{
		browser = ResourceFactory.getBundle().getString("browser");
		URL = ResourceFactory.getBundle().getString("url");
	}
	public static WebDriver getDriver(){
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			driver.get(URL);
		}
		return driver;
	}
	
	public static String getURL(){
		return URL;
	}
}
