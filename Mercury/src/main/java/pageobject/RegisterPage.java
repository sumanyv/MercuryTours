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
	
	/* Page Contact Fields */
	@FindBy(name="firstName")
	private WebElement txtFirstName;
	@FindBy(name="lastName")
	private WebElement txtLastName;
	@FindBy(name="phone")
	private WebElement txtPhone;
	@FindBy(name="userName")
	private WebElement txtEmail;
	
	/* Page Mail Fields */
	@FindBy(name="address1")
	private WebElement txtAddress1;
	@FindBy(name="address2")
	private WebElement txtAddress2;
	@FindBy(name="city")
	private WebElement txtCity;
	@FindBy(name="state")
	private WebElement txtState;
	@FindBy(name="postalCode")
	private WebElement txtPostCode;
	@FindBy(name="country")
	private WebElement selCountry;

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
	
	public void fillMailInfo(String address1,String address2,String city ,String state , String postal , String country){
		txtAddress1.sendKeys(address1);
		txtAddress2.sendKeys(address2);
		txtCity.sendKeys(city);
		txtState.sendKeys(state);
		txtPostCode.sendKeys(postal);
		selCountry.sendKeys(country);
		log.info("Mail info Set : {}, {}, {}, {},{},{}",address1,address2,city,state,postal,country);
	}

}
