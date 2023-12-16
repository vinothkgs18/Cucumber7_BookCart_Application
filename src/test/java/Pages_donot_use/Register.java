package Pages_donot_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Util.DriverInstance;
import io.cucumber.java.en.But;
import io.cucumber.java.en.When;

public class Register extends DriverInstance {
	@When("User enter the first name as {string} Last name as {string} user name as {string} password as {string} and conform password as {string} and click Register button")
	public void user_enter_the_first_name_as_last_name_as_user_name_as_password_as_and_conform_password_as_and_click_register_button(
			String fName, String lName, String uName, String pass, String confirmPass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@data-placeholder='First name']")).sendKeys(fName);
		driver.findElement(By.xpath("//input[@data-placeholder='Last Name']")).sendKeys(lName);
		driver.findElement(By.xpath("//input[@data-placeholder='User Name']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@data-placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@data-placeholder='Confirm Password']")).sendKeys(confirmPass);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='mat-radio-inner-circle'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		Thread.sleep(2000);
	}

	@But("user register not successfully")
	public void user_register_not_successfully() {
	   WebElement error = driver.findElement(By.xpath("//mat-error[@id='mat-error-5']"));
	  // wait= new WebDriverWait(driver,60);
	   //WebElement until = wait.until(ExpectedConditions.visibilityOf(error));
			   
			   
			   //Assert.assertEquals(until.getText(), "User Name is not available");
	}

}
