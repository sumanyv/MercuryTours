/**
 * 
 */
package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.PageObject;

/**
 * @author adityas
 *
 */
public class RegisterConfirmPage implements PageObject{
	
	private WebDriver driver;
	private final Logger log = LoggerFactory.getLogger(RegisterConfirmPage.class);
	private final String title = "Register: Mercury Tours";

	
	@FindBy(linkText="Flights")
	private WebElement lkFlights; 
	@FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")
	private WebElement message;
	
	
	public RegisterConfirmPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	
	public String getMessage(){
		return message.getText();
	}
	
	public FlightFinderPage clickFlights(){
		lkFlights.click();
		return PageFactory.initElements(driver, FlightFinderPage.class);
	}

}
