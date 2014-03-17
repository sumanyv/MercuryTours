package testcase.HOMEPAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.SignonPage;

public class TC_LINK {
	private WebDriver driver;
	
	@Test(dataProvider = "testdata")
	public void LINK(String link, String expected) {

		HomePage home = PageFactory.initElements(driver, HomePage.class);
		SignonPage signon =home.clickSignOn();
		Assert.assertEquals(driver.getTitle(), signon.getTitle());
	}

	@DataProvider
	public Object[][] testdata() {
		return new Object[][] {{ "SIGN-ON", "Sign-on: Mercury Tours" }};
	}
	
	
	@BeforeClass
	public void beforeClass(){
		driver = new FirefoxDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.linkText("Home"));
	}
	
	@AfterClass
	public void afterClass(){
		driver.quit();
	}

}
