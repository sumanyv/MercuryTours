package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Class for providing Test data for all Test cases
 * @author adityas
 *
 */
public class DataFactory {
	static int  MAX_ROW;
	
	static{
		MAX_ROW=  Integer.parseInt(ResourceFactory.bundle.getString("MAX_ROW"));
	}

	public static Object[][] getData(String filePath){
		Object[][]  dataSet= new Object[MAX_ROW][];
		String line =null;
		String split =",";
		int i=0;

		InputStream inputStream = new DataFactory().getClass().getClassLoader().getResourceAsStream(filePath+".csv");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream ));

		try {
			reader.readLine();//First Line col name not used now
			while ((line = reader.readLine()) != null) {
				dataSet[i++]= line.split(split);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataSet;
	}
}
