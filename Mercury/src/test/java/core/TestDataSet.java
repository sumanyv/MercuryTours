package core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDataSet {
	private static final Logger log = LoggerFactory.getLogger(TestDataSet.class);

	@Test
	public void AssertObjectData() {
		Object[][] dataset= DataFactory.getDataObject("testdata/REGISTRATION/CONTACT");

		Assert.assertTrue(dataset.length!=0);
		log.info("Data Set Rows : {} ",dataset.length);
	}
	@Test
	public void AssertObjectDataRows(){
		Object[][] dataset= DataFactory.getDataObject("testdata/REGISTRATION/CONTACT");

		for(int i=0;i<dataset.length;i++){
			for(int j=0;j<dataset[i].length;j++){
				log.info("[{}][{}] = {}",i,j,dataset[i][j]);
			}
		}
	}

}
