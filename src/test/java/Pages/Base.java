package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.DriverInstance;

public class Base {
	
	public static  WebDriver driver;
	public  static WebDriverWait wait;
	
	public Base(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static void scrollToElement(WebElement webElement) {
		JavascriptExecutor  js=(JavascriptExecutor)DriverInstance.getDriver();
		//js.executeScript("arguments[0].scrollIntoView(true);", webElement);
		js.executeScript("window.scrollBy(0,1000)");
		if(!webElement.isDisplayed()) {
			//js.executeScript("arguments[0].scrollIntoView(false);", webElement);
			js.executeScript("window.scrollBy(0,-1000)");
		}
	}
	
	public static void highLightElement(WebElement webElement) {
		JavascriptExecutor  js=(JavascriptExecutor)DriverInstance.getDriver();
		js.executeScript("arguments[0].setAttribute('style','border:4px solid red');", webElement);
		
	}

}
