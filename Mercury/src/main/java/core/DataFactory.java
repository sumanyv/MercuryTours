package core;

/**
 * Factory for creating test data
 * @author adityas
 *
 */
public class DataFactory {
	
	static String datasetType ;
	static{
		datasetType = ResourceFactory.getBundle().getString("dataset.type");
	}
	
	public static Object[][] getData(String filePath){
		if(datasetType.equalsIgnoreCase("csv")){
			return new CsvDataSet().getData(filePath);
		}
		return null;
	}
}
