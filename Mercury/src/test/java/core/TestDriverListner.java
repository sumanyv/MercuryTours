package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestDriverListner {
	
  @Test
  public void f() {
	  
	  WebDriver driver = DriverFactory.getDriver();
	  
	  driver.get(DriverFactory.getURL());
	  
	  driver.findElement(By.name("userName")).sendKeys("Hi");;
	  driver.findElement(By.name("password")).sendKeys("Test");;
	  driver.findElement(By.name("login")).click();
	  
	  driver.quit();
  }
}
