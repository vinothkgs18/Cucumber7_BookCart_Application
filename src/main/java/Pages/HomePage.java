package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Base {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	

	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	public List<WebElement>addToCartButtons;
	
	@FindBy(tagName="mat-list-item")
	public List<WebElement>filters;
	
	@FindBy(xpath="//a[@aria-label='Book title']//img")
	public List<WebElement> searchResult;
	
	@FindBy(xpath="//app-addtocart//button")
	public List<WebElement> addToCartButton;
	
	
	
	//------------------------------------------------------------------------------------------------------------
	
	public void clickSearchResult(int i) {
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(searchResult.get(i))).click();
		//searchResult.get(i).click();
	}
	
	public void clickAddToCartIcon(int i) {
		addToCartButton.get(i).click();
	}

}
