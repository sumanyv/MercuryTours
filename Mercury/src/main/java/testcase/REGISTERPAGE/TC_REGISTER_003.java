package testcase.REGISTERPAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.DataFactory;
import core.DriverFactory;

import pageobject.HomePage;
import pageobject.RegisterPage;

public class TC_REGISTER_003 {
 
	private WebDriver driver ;

	@Test(dataProvider ="mail" )
	public void MAIL_DATA(String address1,String address2,String city , String state ,String postal , String country){
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		RegisterPage register = home.clickRegister();
		register.fillMailInfo(address1, address2, city, state, postal, country);
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
