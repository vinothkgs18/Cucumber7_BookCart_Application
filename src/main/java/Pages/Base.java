package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static  WebDriver driver;
	public  static WebDriverWait wait;
	
	public Base(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
