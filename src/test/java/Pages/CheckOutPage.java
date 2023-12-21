package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage {

	/*public CheckOutPage(WebDriver driver) {
		super(driver);

	}*/
	
	/*Single Ton
	 * 
	 */
	
	private static CheckOutPage checkOutPage;
	private CheckOutPage() {}
	public static CheckOutPage getInstance() {
		if(checkOutPage==null) {
			checkOutPage=new CheckOutPage();
		}
		return checkOutPage;
	}

	@FindBy(tagName = "input")
	public List<WebElement> textBoxForShippingAddress;

	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	public WebElement placeOrderButton;

	public void fillAddress() {
		Base.highLightElement(textBoxForShippingAddress.get(1));
		textBoxForShippingAddress.get(1).sendKeys("Vinoth Kumar");
		Base.highLightElement(textBoxForShippingAddress.get(2));
		textBoxForShippingAddress.get(2).sendKeys("2/8 Valmigi Street");
		Base.highLightElement(textBoxForShippingAddress.get(3));
		textBoxForShippingAddress.get(3).sendKeys("Sembakkam Chennai");
		Base.highLightElement(textBoxForShippingAddress.get(4));
		textBoxForShippingAddress.get(4).sendKeys("600073");
		Base.highLightElement(textBoxForShippingAddress.get(5));
		textBoxForShippingAddress.get(5).sendKeys("Tamil Nadu");
	}
	
	public void clickCheckoutButton() {
		Base.highLightElement(placeOrderButton);
		placeOrderButton.click();
	}

}
