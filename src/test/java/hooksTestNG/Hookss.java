package hooksTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hookss  {

	
	DriverInstance driverInstance;
	WebDriver driver;
	
	@Before(order=1)
	public void startUp() {
		System.out.println("***********Browser launched*****************");
		driverInstance=new DriverInstance();
		driver = driverInstance.initializeBrowserDriver("chrome");
		driver.get("https://bookcart.azurewebsites.net/");
		System.out.println("Naviagate to application");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}
	
	@Before(order=2)
	public void PageFactory() {
		System.out.println("pageFactory method working");
		
		
	}
	
	

	@After
	public void tearDown() {

		System.out.println("***********Browser closed*****************");
		driver.quit();
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] image = tk.getScreenshotAs(OutputType.BYTES);
		scenario.attach(image, "image/png", "Screenshot for step");
	}
}
