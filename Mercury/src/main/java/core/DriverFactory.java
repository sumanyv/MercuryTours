package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverFactory {

	private static Logger log = LoggerFactory.getLogger(DriverFactory.class);
	private static String browser;
	private static String URL;

	static{
		browser = ResourceFactory.getBundle().getString("browser");
		URL = ResourceFactory.getBundle().getString("url");
	}
	/**
	 * Method to get WebDriver based on app properties
	 */
	public static WebDriver getDriver(){
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			driver.get(URL);
			log.info("Firefox Driver Created : {}" ,driver);
		}
		return driver;
	}
	
	/**
	 * Method to get URL
	 */
	public static String getURL(){
		return URL;
	}
}
