package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CsvDataSet implements DataSet {
	static int  MAX_ROW;
	static{
		MAX_ROW=  Integer.parseInt(ResourceFactory.getBundle().getString("dataset.csv.maxrow"));
	}

	CsvDataSet(){
	}

	@Override
	public Object[][] getData(String filePath) {
		Object[][]  dataSet= new Object[MAX_ROW][];
		String line =null;
		String split =",";
		int i=0;

		InputStream inputStream = CsvDataSet.this.getClass().getClassLoader().getResourceAsStream(filePath+".csv");
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
		Object[][] toReturn = new Object[i][];
		toReturn = Arrays.copyOf(dataSet,i);
		return toReturn;
	}

}
