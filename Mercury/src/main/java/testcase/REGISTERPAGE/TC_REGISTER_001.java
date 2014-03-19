package testcase.REGISTERPAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
	private RegisterPage register;
	
	@Test(dataProvider = "contact")
	public void CONTACT_DATA(String FirstName, String LastName,String Phone, String Email) {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		register = home.clickRegister();
		register.fillContactInfo(FirstName, LastName, Phone, Email);
	}
	
	@Test(dataProvider ="mail" ,dependsOnMethods= {"CONTACT_DATA"})
	public void MAIL_DATA(String address1,String address2,String city , String state ,String postal , String country){
		register.fillMailInfo(address1, address2, city, state, postal, country);
	}
	
	@DataProvider
	public Object[][] contact() {
		Object[][] dataset = DataFactory.getData("testdata/REGISTRATION/CONTACT");
		return dataset;
	}

	@DataProvider
	public Object[][] mail(){
		Object[][] dataset = DataFactory.getData("testdata/REGISTRATION/MAIL");
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
