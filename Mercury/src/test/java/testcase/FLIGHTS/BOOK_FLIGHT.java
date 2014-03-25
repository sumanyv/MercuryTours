package testcase.FLIGHTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import pageobject.FlightFinderPage;
import pageobject.HomePage;
import pageobject.RegisterConfirmPage;
import pageobject.RegisterPage;

import core.DriverFactory;

public class BOOK_FLIGHT {
	private WebDriver driver;

	@Test
	public void FLIGHT() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		RegisterPage register = home.clickRegister();
		register.fillUserInfo("aditya@gmail.com", "1234");
		RegisterConfirmPage confirm =register.clickSubmit();
		Assert.assertTrue(confirm.getMessage().contains("aditya@gmail.com"));
		FlightFinderPage flightFinder =confirm.clickFlights();
		
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
