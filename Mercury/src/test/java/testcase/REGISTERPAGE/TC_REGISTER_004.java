package testcase.REGISTERPAGE;

import java.util.Map;

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

public class TC_REGISTER_004 {

	private WebDriver driver ;

	@Test(dataProvider = "dp")
	public void REGISTER_MAP(Map<String,String> dataset) {
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		RegisterPage register = home.clickRegister();
		register.fillContactInfo(dataset.get("FirstName"), dataset.get("LastName"), dataset.get("Phone"), dataset.get("Email"));
		register.fillMailInfo(dataset.get("Address1"), dataset.get("Address2"), dataset.get("City"), dataset.get("State"), dataset.get("Postal"), dataset.get("Country"));
		register.fillUserInfo(dataset.get("Username"), dataset.get("Password"));
		register.clickSubmit();
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
	
	@DataProvider
	public Object[][] dp() {
		Map<String, String>[]data =  DataFactory.getDataMap("testdata/REGISTRATION/REGISTER");
		Object[][] oArr = new Object[data.length][];
		for(int i=0;i<data.length;++i){
			Object[] o = {data[i]};
			oArr[i]=o;}
		return oArr;
	}
}
