package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.PageObject;

public class RegisterPage implements PageObject {
	
	private final Logger log = LoggerFactory.getLogger(RegisterPage.class);
	private final String title = "Register: Mercury Tours";
	private WebDriver driver;
	
	/* Contact Fields */
	@FindBy(name="firstName")
	private WebElement txtFirstName;
	@FindBy(name="lastName")
	private WebElement txtLastName;
	@FindBy(name="phone")
	private WebElement txtPhone;
	@FindBy(name="userName")
	private WebElement txtEmail;
	
	/* Mail Fields */
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
	
	/* User Info Fields */
	@FindBy(name="email")
	private WebElement txtUserName;
	@FindBy(name="password")
	private WebElement txtPassword;
	@FindBy(name="confirmPassword")
	private WebElement txtConfirmPass;
	
	/* Submit Button */
	@FindBy(name="register")
	private WebElement btSubmit;
	
	
	/**
	 * Returns the getTxtFirstName
	 * @param txtFirstName
	 */
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	/**
	 * Returns the getTxtLastName
	 * @param txtLastName
	 */
	public WebElement getTxtLastName() {
		return txtLastName;
	}

	/**
	 * Returns the getTxtPhone
	 * @param txtPhone
	 */
	public WebElement getTxtPhone() {
		return txtPhone;
	}

	/**
	 * Returns the getTxtEmail
	 * @param txtEmail
	 */
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	/**
	 * Returns the getTxtAddress1
	 * @param txtAddress1
	 */
	public WebElement getTxtAddress1() {
		return txtAddress1;
	}

	/**
	 * Returns the getTxtAddress2
	 * @param txtAddress2
	 */
	public WebElement getTxtAddress2() {
		return txtAddress2;
	}

	/**
	 * Returns the getTxtCity
	 * @param txtCity
	 */
	public WebElement getTxtCity() {
		return txtCity;
	}

	/**
	 * Returns the getTxtState
	 * @param txtState
	 */
	public WebElement getTxtState() {
		return txtState;
	}

	/**
	 * Returns the getTxtPostCode
	 * @param txtPostCode
	 */
	public WebElement getTxtPostCode() {
		return txtPostCode;
	}

	/**
	 * Returns the getSelCountry
	 * @param selCountry
	 */
	public WebElement getSelCountry() {
		return selCountry;
	}

	/**
	 * Returns the getTxtUserName
	 * @param txtUserName
	 */
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	/**
	 * Returns the getTxtPassword
	 * @param txtPassword
	 */
	public WebElement getTxtPassword() {
		return txtPassword;
	}

	/**
	 * Returns the getTxtConfirmPass
	 * @param txtConfirmPass
	 */
	public WebElement getTxtConfirmPass() {
		return txtConfirmPass;
	}

	/**
	 * Returns the getBtSubmit
	 * @param btSubmit
	 */
	public WebElement getBtSubmit() {
		return btSubmit;
	}

	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}

	@Override
	public String getTitle() {
		log.info("Page Title : {}",title);
		return title;
	}
	
	/**
	 * Service to fill contact info in Registration Page
	 * @param
	 */
	public void fillContactInfo(String firstName ,String lastName, String phone , String email){
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		txtPhone.sendKeys(phone);
		txtEmail.sendKeys(email);
		log.info("Contact info Set : {}, {}, {}, {} ",firstName,lastName,phone,email);
	}
	
	/**
	 * Service to fill Mail info in Registration Page
	 * @param
	 */
	public void fillMailInfo(String address1,String address2,String city ,String state , String postal , String country){
		txtAddress1.sendKeys(address1);
		txtAddress2.sendKeys(address2);
		txtCity.sendKeys(city);
		txtState.sendKeys(state);
		txtPostCode.sendKeys(postal);
		selCountry.sendKeys(country);
		log.info("Mail info Set : {}, {}, {}, {},{},{}",address1,address2,city,state,postal,country);
	}
	
	/**
	 * 
	 * Service to fill User info in Registration Page
	 * @param
	 */
	public void fillUserInfo(String username , String password){
		txtUserName.sendKeys(username);
		txtPassword.sendKeys(password);
		txtConfirmPass.sendKeys(password);
	}
	
	/**
	 * Service to Click on Submit Button in Registration Page
	 * @param
	 * @return 
	 */
	public RegisterConfirmPage clickSubmit(){
		btSubmit.click();
		return PageFactory.initElements(driver, RegisterConfirmPage.class);
	}

}
