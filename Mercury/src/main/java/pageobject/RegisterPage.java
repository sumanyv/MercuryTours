package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.PageObject;

public class RegisterPage implements PageObject {
	
	private final Logger log = LoggerFactory.getLogger(RegisterPage.class);
	private final String title = "Register: Mercury Tours";
	private WebDriver driver;
	
	/* Page Fields */
	@FindBy(name="firstName")
	private WebElement txtFirstName;
	@FindBy(name="lastName")
	private WebElement txtLastName;
	@FindBy(name="phone")
	private WebElement txtPhone;
	@FindBy(name="userName")
	private WebElement txtEmail;

	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}

	@Override
	public String getTitle() {
		log.info("Page Title : {}",title);
		return title;
	}
	
	public void fillContactInfo(String firstName ,String lastName, String phone , String email){
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		txtPhone.sendKeys(phone);
		txtEmail.sendKeys(email);
		log.info("Contact info Set : {}, {}, {}, {} ",firstName,lastName,phone,email);
	}

}
