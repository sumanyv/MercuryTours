package testcase.HOMEPAGE;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TC_LINK {
  @Test(dataProvider = "testdata")
  public void f(String link, String expected) {
	  
  }

  @DataProvider
  public Object[][] testdata() {
    return new Object[][] {{ "SIGN-ON", "Sign-on : Mercury Tours" }};
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
