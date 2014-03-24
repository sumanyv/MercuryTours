package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.PageObject;

public class SignonPage implements PageObject{

	private final Logger log = LoggerFactory.getLogger(SignonPage.class);
	private final String title = "Sign-on: Mercury Tours";
	
	@FindBy(name="userName")
	private WebElement txtUserName;
	@FindBy(name="password")
	private WebElement txtPassword;
	
	@Override
	public String getTitle(){
		log.info("Page Title : {}",title);
		return title;
	}
	
	/**
	 * Service to Fill userName
	 * @param
	 */
	public void fillUserName(String userName){
		txtUserName.sendKeys(userName);
	}
	
	/**
	 * Service to Fill password
	 * @param
	 */
	public void fillPassword(String password){
		txtPassword.sendKeys(password);
	}
}
