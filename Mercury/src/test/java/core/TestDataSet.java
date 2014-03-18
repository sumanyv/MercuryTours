package core;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDataSet {
  @Test
  public void AssetGetData() {
	  Object[][] dataset= DataFactory.getData("testdata/REGISTRATION/FORM");
  
	  Assert.assertTrue(dataset.length!=0);
	  System.out.println("Data Set Rows : "+dataset.length);
  }
  
}
