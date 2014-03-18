package core;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	static String browser;
	static String URL;
	static{
		ResourceBundle appResrc = ResourceBundle.getBundle("webapp");
		browser = appResrc.getString("browser");
		URL = appResrc.getString("URL");
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
