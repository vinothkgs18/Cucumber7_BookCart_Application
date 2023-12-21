package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Util.DriverInstance;


public class Cartpage {

	/*public Cartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/
	
	/*
	 * Single Ton-------------------------------------------------------
	 * 
	 */
	private static Cartpage cartPage;
	private Cartpage() {}
	public static Cartpage getInstance() {
		if(cartPage==null) {
			cartPage=new Cartpage();
		}
		return cartPage;
	}
	//-----------------------------------------------------------------------
	@FindBy(xpath="//td/a")
	public List<WebElement> bookTitlesInCartListo;
	
	@FindBy(xpath="//span[text()='Clear cart']//parent::button")
	public WebElement clearCartButton;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-elevation-z4 mat-raised-button mat-button-base mat-warn']")
	public WebElement checkOutButton;
	//--------------------------------------------------------------------------------
	
	public String getTextFromBookTitle_cartItem(int i) {
		WebDriverWait wait=new WebDriverWait(DriverInstance.getDriver(),10);
		String text=wait.until(ExpectedConditions.visibilityOf(bookTitlesInCartListo.get(i))).getText();
		return text;
		
	}
	
	public void clickClearCartButton() {
		Base.highLightElement(clearCartButton);
		clearCartButton.click();
	}
	
	public void clickCheckoutButton() {
		Base.highLightElement(checkOutButton);
		checkOutButton.click();
	}

}
