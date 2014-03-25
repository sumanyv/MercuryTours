package testcase.HOMEPAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobject.HomePage;
import core.DriverFactory;

public class TC_SIGNON {
private WebDriver driver;
	
	@Test
	public void VALID() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.signIn("aditya", "test");
	}
	
	@BeforeClass
	public void beforeClass(){
		driver = DriverFactory.getDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get(DriverFactory.getURL());
	}

		
	@AfterClass
	public void afterClass(){
		driver.quit();
	}

}
