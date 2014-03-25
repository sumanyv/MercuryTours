package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.PageObject;

public class HomePage implements PageObject{

	private final Logger log = LoggerFactory.getLogger(HomePage.class);
	private final String title = "Welcome: Mercury Tours";
	private WebDriver driver ;

	/* Links in Page */
	@FindBy(linkText="SIGN-ON")
	private WebElement lkSignOn;
	@FindBy(linkText="REGISTER")
	private WebElement lkRegister;
	@FindBy(linkText="Flights")
	private WebElement lkFlights;
	
	/* Sign on Frame */
	@FindBy(name="userName")
	private WebElement txtUsername;
	@FindBy(name="password")
	private WebElement txtPassword;
	@FindBy(name="login")
	private WebElement btSubmit;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}

	
	public void signIn(String username , String password){
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		btSubmit.click();
	}
	
	
	/**
	 * Service to Click on SignOn Link
	 * @param
	 */
	public SignonPage clickSignOn() {
		lkSignOn.click();
		return PageFactory.initElements(driver, SignonPage.class);
		
	}
	
	/**
	 * Service to Click on Register Link
	 * @param
	 */
	public RegisterPage clickRegister(){
		lkRegister.click();
		return PageFactory.initElements(driver, RegisterPage.class);
	}
	
	public void clickFlights(){
		lkFlights.click();
	}
	
	@Override
	public String getTitle(){
		log.info("Page Title : {}",title);
		return title;
	}

}
