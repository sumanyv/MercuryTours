package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{
	
	@FindBy(linkText="SIGN-ON")
	private WebElement signOnLink;
	
	public void clickSignOn() {
		signOnLink.click();
	}
	


}
