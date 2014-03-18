package core;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDriverFactory {
  @Test
  public void firefox() {
	 WebDriver driver= DriverFactory.getDriver();
	 Assert.assertTrue(driver!=null);
	 driver.quit();
  }
}
