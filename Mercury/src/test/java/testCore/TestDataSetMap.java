package testCore;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import core.DataFactory;

public class TestDataSetMap {
	private Logger log = LoggerFactory.getLogger(TestDataSetMap.class);
  @Test(dataProvider = "dp")
  public void f(Map<String,String> dataset) {
	  
	  log.info("FirstName {} ",dataset.get("FirstName"));
	  log.info("LastName {} ",dataset.get("LastName"));
	  log.info("Email {} ",dataset.get("Phone"));
	  log.info("Phone {} ",dataset.get("Email"));
	  
	  log.info("List of Keys");
	  log.info("Keys : ",dataset.keySet());
	  log.info("Value set : {}",dataset.values());

	  log.info("Key check : {}",dataset.containsKey("FirstName"));
	  dataset.values();
	  
  }
  

  @DataProvider
  public Object[][] dp() {
    Map<String, String>[]data =  DataFactory.getDataMap("testdata/REGISTRATION/CONTACT");
    Object[][] oArr = new Object[data.length][];
    for(int i=0;i<data.length;++i){
    	Object[] o = {data[i]};
    	oArr[i]=o;
    }
	return oArr;
  }
}
