package core;

import java.util.ResourceBundle;

public class ResourceFactory {

	static ResourceBundle bundle;

	static{
		bundle = ResourceBundle.getBundle("webapp");

	}

	public static ResourceBundle getBundle(){
		return bundle;
	}

}
