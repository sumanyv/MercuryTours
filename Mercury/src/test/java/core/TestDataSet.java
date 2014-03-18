package core;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDataSet {
  @Test
  public void TC() {
	  Object[][] dataset= DataFactory.getData("testdata/REGISTRATION/FORM");
  
	  Assert.assertTrue(dataset.length!=0);

  }
  
}
