package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Base {

	
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}



	@FindBy(xpath = "//input[@id='mat-input-0']")
	public WebElement userName;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	public WebElement password;

	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	public WebElement loginButton;

	@FindBy(id = "mat-error-0")
	private WebElement loginerrorText;
	
	@FindBy(xpath="//span[text()='Register']")
	public WebElement registerButton;
	
	@FindBy(xpath="//h3[text()='Login']")
	public WebElement loginText;
	
	//------------------------------------------------------------------------------------------------------------------
	
	public void doLogin(String userNameText,String passwordText) {
		userName.sendKeys(userNameText);
		password.sendKeys(passwordText);
		loginButton.click();
		
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}
	
	public String getText_login() {
		wait= new WebDriverWait(driver, 3);
		//String text = wait.until(ExpectedConditions.visibilityOf(loginText)).getText();
		
		return loginText.getText();
	}

}
