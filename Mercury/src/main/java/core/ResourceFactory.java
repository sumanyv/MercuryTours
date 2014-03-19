package core;

import java.util.ResourceBundle;

/**
 * Class for loading the Application properties
 * @author adityas
 *
 */
public class ResourceFactory {
	private static ResourceBundle bundle;
	static{
		bundle = ResourceBundle.getBundle("webapp");

	}
	// Object creation restricted
	private ResourceFactory(){	
	}
	
	/**
	 * Method to get ResourceBundle
	 */
	public static ResourceBundle getBundle(){
		return bundle;
	}

}
