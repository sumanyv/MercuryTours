package testCore;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import core.DriverFactory;

public class TestDriverFactory {
  @Test
  public void firefox() {
	 WebDriver driver= DriverFactory.getDriver();
	 Assert.assertTrue(driver!=null);
	 driver.quit();
  }
}
