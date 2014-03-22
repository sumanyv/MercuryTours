package testcase.HOMEPAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.DriverFactory;

import pageobject.HomePage;
import pageobject.RegisterPage;
import pageobject.SignonPage;

public class TC_LINK {
	private WebDriver driver;
	
	@Test
	public void SIGNON() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		SignonPage signon =home.clickSignOn();
		Assert.assertEquals(driver.getTitle(), signon.getTitle());
	}
	
	@Test
	public void REGISTER(){
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		RegisterPage register = home.clickRegister();
		Assert.assertEquals(driver.getTitle(), register.getTitle());
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
