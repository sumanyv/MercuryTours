package pageobject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.PageObject;

public class SignonPage implements PageObject{

	private final Logger log = LoggerFactory.getLogger(SignonPage.class);
	private final String title = "Sign-on: Mercury Tours";
	
	public String getTitle(){
		log.info("Page Title : {}",title);
		return title;
	}
}
