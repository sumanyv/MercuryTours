package pageobject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.PageObject.PageObject;

public class RegisterPage implements PageObject {
	
	private final Logger log = LoggerFactory.getLogger(RegisterPage.class);
	private final String title = "Register: Mercury Tours";

	public RegisterPage() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTitle() {
		log.info("Page Title : {}",title);
		return title;
	}

}
