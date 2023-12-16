package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Base {

	public Registerpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@data-placeholder='First name']")
	public WebElement firstNameTextBox;

	@FindBy(xpath = "//input[@data-placeholder='Last Name']")
	public WebElement lastNameTextBox;

	@FindBy(xpath = "//input[@data-placeholder='User Name']")
	public WebElement userNameTextBox;

	@FindBy(xpath = "//input[@data-placeholder='Password']")
	public WebElement passwordTextBox;

	@FindBy(xpath = "//input[@data-placeholder='Confirm Password']")
	public WebElement conformPaasswordTextBox;

	@FindBy(xpath = "(//span[@class='mat-radio-inner-circle'])[1]")
	public WebElement GenderMaleRadioButton;

	@FindBy(xpath = "//span[text()='Register']//parent::button")
	public WebElement registerButton;
	// --------------------------------------------------------------------------------------------------

	public void doRegisterUser(String fName, String lName, String usrName, String pass) {
		firstNameTextBox.sendKeys(fName);
		lastNameTextBox.sendKeys(lName);
		userNameTextBox.sendKeys(usrName);
		passwordTextBox.sendKeys(pass);
		conformPaasswordTextBox.sendKeys(pass);
		GenderMaleRadioButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		registerButton.click();

	}
	
	
}
