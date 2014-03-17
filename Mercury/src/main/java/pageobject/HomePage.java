package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage{
	
	private final Logger logger = LoggerFactory.getLogger(HomePage.class);
	@FindBy(linkText="SIGN-ON")
	private WebElement signOnLink;
	
	public void clickSignOn() {
		signOnLink.click();
		logger.info("Click on WebElement : {} ",signOnLink);
	}
	


}
