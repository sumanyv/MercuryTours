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

public class TC_REGISTER_002 {

	private WebDriver driver ;
	private RegisterPage register;
	
	@Test(dataProvider = "register")
	public void REGISTER(
			String FirstName,
			String LastName,
			String Phone,
			String Email,
			String address1,
			String address2,
			String city,
			String state,
			String postal,
			String country,
			String username,
			String password
			) {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		register = home.clickRegister();
		register.fillContactInfo(FirstName, LastName, Phone, Email);
		register.fillMailInfo(address1, address2, city, state, postal, country);
		register.fillUserInfo(username, password);
		register.clickSubmit();
	}
	
	@DataProvider
	public Object[][] register(){
		Object[][] dataset = DataFactory.getDataObject("testdata/REGISTRATION/REGISTER");
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
