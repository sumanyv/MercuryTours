package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.PageObject.PageObject;

public class HomePage implements PageObject{

	private final Logger log = LoggerFactory.getLogger(HomePage.class);
	private final String title = "Welcome: Mercury Tours";
	private WebDriver driver ;

	/* Links in Page */
	@FindBy(linkText="SIGN-ON")
	private WebElement signOnLink;
	@FindBy(linkText="REGISTER")
	private WebElement registerLink;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}

	public SignonPage clickSignOn() {
		signOnLink.click();
		log.info("Click Successfull : {} ",signOnLink);
		return PageFactory.initElements(driver, SignonPage.class);
		
	}
	
	public RegisterPage clickRegister(){
		registerLink.click();
		log.info("Click Successfull : {} ",registerLink);
		return PageFactory.initElements(driver, RegisterPage.class);
	}
	

	public String getTitle(){
		log.info("Page Title : {}",title);
		return title;
	}

}
