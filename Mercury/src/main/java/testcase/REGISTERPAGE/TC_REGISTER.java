package testcase.REGISTERPAGE;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.DataFactory;
import core.DriverFactory;

public class TC_REGISTER {

	WebDriver driver ;
	@Test(dataProvider = "dp")
	public void REGISTER_DATA(String FirstName, String LastName,String Phone, String Email) {
		
		System.out.println("Values :"+FirstName);
	}
	@DataProvider
	public Object[][] dp() {
		
		Object[][] dataset = DataFactory.getData("testdata/REGISTRATION/FORM");
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
