package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInstance {
	
	public  WebDriver driver;
	//public  static WebDriverWait wait;
	public static ThreadLocal<WebDriver>tDriver=new ThreadLocal<>();
	
	
	
	
	
	
	
	public WebDriver initializeBrowserDriver(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome Browser launched");
			WebDriverManager.chromedriver().setup();
			tDriver.set(new ChromeDriver());
		} 
		else if (browserName.equalsIgnoreCase("edge")) {
			tDriver.set(new EdgeDriver());
		} else {
			System.out.println("Invalid Browser selection");
		}
		return getDriver();
	}
	
	public static WebDriver getDriver() {
		return tDriver.get();
	}
	
	
	public WebElement waitforElement(WebElement element, long durationInSeconds) {
		WebElement webElement = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, durationInSeconds);
			webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return webElement;
	}
	
	
	
	}
	




