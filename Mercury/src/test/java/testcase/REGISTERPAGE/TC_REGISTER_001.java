package testcase.REGISTERPAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.RegisterPage;

import core.DataFactory;
import core.DriverFactory;

public class TC_REGISTER_001 {
	private WebDriver driver ;

	@Test(dataProvider = "contact")
	public void CONTACT_DATA(String FirstName, String LastName,String Phone, String Email) {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		RegisterPage register = home.clickRegister();
		register.fillContactInfo(FirstName, LastName, Phone, Email);
	}
	@DataProvider
	public Object[][] contact() {
		Object[][] dataset = DataFactory.getDataObject("testdata/REGISTRATION/CONTACT");
		return dataset;
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
