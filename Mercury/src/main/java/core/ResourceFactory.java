package core;

import java.util.ResourceBundle;

public class ResourceFactory {

	private static ResourceBundle bundle;

	static{
		bundle = ResourceBundle.getBundle("webapp");

	}

	public static ResourceBundle getBundle(){
		return bundle;
	}

}
