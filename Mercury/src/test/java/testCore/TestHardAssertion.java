package testCore;

import org.testng.annotations.Test;

import core.HardAssertion;

public class TestHardAssertion {
	private HardAssertion mAssert = new HardAssertion();

  @Test
  public void fail(){
	  mAssert.assertEquals("1", "0");
  }
  
  @Test
  public void failed(){
	 mAssert.assertTrue(1>5,"Failed");
  }
}
