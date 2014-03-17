package core;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDataSet {
  @Test
  public void TC() {
	  DataSet dSet = new DataSet("HOMEPAGE/TC_LINK");
	  ArrayList<String[]> dataset = (ArrayList<String[]>) dSet.getData();
	  
	  Assert.assertTrue(dataset.size()!=0);

  }
  
}
