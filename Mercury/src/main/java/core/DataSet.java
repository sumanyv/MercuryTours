package core;
/**
 * All test data types should implement this interface
 * @author adityas
 *
 */
public interface DataSet {

	/**
	 * Return a array of data set
	 * @param filePath
	 * @return Object[][]
	 */
	public Object[][] getData(String filePath);
}
