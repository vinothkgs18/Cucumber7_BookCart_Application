package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cartpage extends Base {

	public Cartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//td/a")
	public List<WebElement> bookTitlesInCartListo;
	
	@FindBy(xpath="//span[text()='Clear cart']//parent::button")
	public WebElement clearCartButton;
	//--------------------------------------------------------------------------------
	
	public String getTextFromBookTitle_cartItem(int i) {
		wait=new WebDriverWait(driver,10);
		String text=wait.until(ExpectedConditions.visibilityOf(bookTitlesInCartListo.get(i))).getText();
		return text;
		
	}
	
	public void clickClearCartButton() {
		clearCartButton.click();
	}

}
