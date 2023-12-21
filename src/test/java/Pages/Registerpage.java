package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Registerpage{

	/*public Registerpage(WebDriver driver) {
		super(driver);
	}*/
	
	private static Registerpage registerpage;
	private Registerpage() {
		
	}
	public static Registerpage getInstance() {
		if(registerpage==null) {
			registerpage =new Registerpage();
		}
		return registerpage;
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
		Base.highLightElement(firstNameTextBox);
		firstNameTextBox.sendKeys(fName);
		Base.highLightElement(lastNameTextBox);
		lastNameTextBox.sendKeys(lName);
		Base.highLightElement(userNameTextBox);
		userNameTextBox.sendKeys(usrName);
		Base.highLightElement(passwordTextBox);
		passwordTextBox.sendKeys(pass);
		Base.highLightElement(conformPaasswordTextBox);
		conformPaasswordTextBox.sendKeys(pass);
		Base.highLightElement(GenderMaleRadioButton);
		GenderMaleRadioButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Base.highLightElement(registerButton);
		registerButton.click();

	}
	
	
}
