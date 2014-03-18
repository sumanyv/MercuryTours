package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for providing Test data for all Test cases
 * @author adityas
 *
 */
public class DataFactory {

	@SuppressWarnings("null")
	public static Object[][] getData(String filePath){
		List<String[]>  dataSet= new ArrayList<String[]>();
		String line =null;
		String split =",";

		InputStream inputStream = new DataFactory().getClass().getClassLoader().getResourceAsStream(filePath+".csv");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream ));

		try {
			while ((line = reader.readLine()) != null) {
				dataSet.add(line.split(split));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String[] row:dataSet){
			Object[i] da = row;
		}
		return dataSet;
	}
}
