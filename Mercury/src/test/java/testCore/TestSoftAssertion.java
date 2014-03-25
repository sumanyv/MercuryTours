package testCore;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssertion {
	
	SoftAssert sVerify = new SoftAssert();
	@Test
	public void verify1() {
		sVerify.assertEquals(false, true, "Not Equal Verify1");
	}

	@Test
	public void verify2() {
		sVerify.assertTrue("Hi".equals("Bye"), " Verify2");
	}

	@Test(dependsOnMethods={"verify2","verify1"})
	public void afterTest() {
		sVerify.assertAll();
	}

}
