package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CsvDataSet implements DataSet {
	private static final Logger log = LoggerFactory.getLogger(CsvDataSet.class);
	static int  MAX_ROW;
	static{
		MAX_ROW=  Integer.parseInt(ResourceFactory.getBundle().getString("dataset.csv.maxrow"));
	}

	CsvDataSet(){
	}

	@Override
	public Object[][] getDataObject(String filePath) {
		Object[][]  dataSet= new Object[MAX_ROW][];
		String line =null;
		String split =",";
		int i=0;

		InputStream inputStream = CsvDataSet.this.getClass().getClassLoader().getResourceAsStream(filePath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream ));

		try {
			reader.readLine();//First Line col name not used now
			while ((line = reader.readLine()) != null) {
				dataSet[i++]= line.split(split);
			}
		} catch (IOException e) {
			log.error("Unable to Read from File : {} ",filePath);
			e.printStackTrace();
		}
		Object[][] toReturn = new Object[i][];
		toReturn = Arrays.copyOf(dataSet,i);
		return toReturn;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, String>[] getDataMap(String filePath) {
		Map<String,String> [] dataMap = new HashMap[MAX_ROW];

		InputStream inputStream = CsvDataSet.this.getClass().getClassLoader().getResourceAsStream(filePath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream ));

		String line =null;
		String split =",";
		int i=0;

		try {
			String headerLine = reader.readLine();//First Line is the header
			String[] headerList = headerLine.split(split);
			int colCount = headerList.length;
			while ((line = reader.readLine()) != null) {
				Map<String,String> data = new HashMap<String,String>();

				String[] rowList = line.split(split);
				for(int j=0;j<colCount;++j){
					data.put(headerList[j].trim(), rowList[j].trim());
				}	
				dataMap[i++]=data;
			}
		} catch (IOException e) {
			log.error("Unable to Read from File : {} ",filePath);
			e.printStackTrace();
		}
		Map<String,String>[] toReturn = Arrays.copyOf(dataMap,i);
		return toReturn;
	}

}
