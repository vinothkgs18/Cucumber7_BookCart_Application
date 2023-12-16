package Pages_donot_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Util.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends DriverInstance {

	/*
	 * 
	 * @FindBy(xpath="//input[@id='mat-input-0']") public WebElement userName;
	 * 
	 * @FindBy(xpath="//input[@id='mat-input-1']") public WebElement password;
	 * 
	 * @FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']") public WebElement loginButton;
	 * 
	 * @FindBy(id="mat-error-0") public WebElement loginerrorText;
	 * 
	 * 
	 * @When("Enter the username as {string} and password as {string}") public void
	 * enter_the_username_as_and_password_as(String username, String Password) {
	 * userName.sendKeys(username); password.sendKeys(Password); }
	 * 
	 * @When("click login button") public void click_login_button() {
	 * loginButton.click(); }
	 * 
	 * 
	 * @When("user get error message in login page") public void
	 * user_get_error_message_in_login_page() {
	 * Assert.assertEquals(loginerrorText.getText(),
	 * "Username or Password is incorrect."); }
	 * 
	 * 
	 * 
	 * 
	 */

	// without Page factory
	@When("Enter the username as {string} and password as {string}")
	public void enter_the_username_as_and_password_as(String username, String password) {
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(password);
	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(
				By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']"))
				.click();
	}

	@When("user get error message in login page")
	public void user_get_error_message_in_login_page() {
		WebElement loginerrorText = driver.findElement(By.id("mat-error-0"));
		Assert.assertEquals(loginerrorText.getText(), "Username or Password is incorrect.");
	}

	@Given("User click on Register button")
	public void user_click_on_register_button() {
		driver.findElement(By.xpath("//span[text()='Register']")).click();

	}
	
	
	@Then("user register successfully")
	public void user_register_successfully() {
	   String text = driver.findElement(By.tagName("h3")).getText();
	   Assert.assertEquals(text, "Login");
	}
}
