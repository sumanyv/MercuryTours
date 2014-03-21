package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebEventListner implements WebDriverEventListener {

	private final Logger log = LoggerFactory.getLogger("STEP");
	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		log.info("START : Navigate To : {} ",url);

	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		log.info("FINISH : Navigate To : {} ",url);
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		//TODO later implementation
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {

	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {

	}

	@Override
	public void afterNavigateForward(WebDriver driver) {

	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {

		log.info("START : Operation On : {} ",by.toString());
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		log.info("FINISH : Operation On : {} ",by.toString());
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		log.info("START : Click On : {} ",element.getText());
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		log.info("FINISH : Click On : {} ",element.getText());
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		log.info("CURRENT : Element : {} , Value : {} ",element.getText(),element.getAttribute("value") );
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		log.info("CHANGED : Element : {} , Value : {} ",element.getText(),element.getAttribute("value") );
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		log.info("START : Executing Script : {} ",script);
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		log.info("FINISHED : Execution Script {}",script);
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		log.info("EXCEPTION : {} ",throwable.getMessage());
	}

}
