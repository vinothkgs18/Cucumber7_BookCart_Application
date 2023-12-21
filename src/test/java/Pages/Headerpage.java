package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Headerpage{
	
	

	/*public Headerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/
	
	
	
	/*Implementing single ton---------------------------------------------------------------------------------
	 * 
	 * 
	 */
	
	private static Headerpage headerPage;
	private Headerpage() {
		
	}
	
	public static Headerpage getInstance() {
		if(headerPage==null) {
			headerPage=new Headerpage();
		}
		return headerPage;
	}
//----------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[text()='Login']")
	public WebElement loginLink;

	@FindBy(xpath = "(//button[@class='mat-focus-indicator mat-menu-trigger mat-button mat-button-base ng-star-inserted']//span)[1]")
	public WebElement profileIcon;

	@FindBy(tagName = "input")
	public  WebElement searchBar;
	
	@FindBy(tagName = "mat-option")
	public List<WebElement> sugOptions;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-icon-button mat-button-base']")
	public WebElement bascatIcon;
	
	

	// -----------------------------------------------------------------------------------------------------------

	
	
	public void clickLoginLink() {
		Base.highLightElement(loginLink);
		loginLink.click();

	}

	public String gettingTextFromProfile() {
		Base.highLightElement(profileIcon);
		String text = profileIcon.getText();
		return text;
	}

	public void doGlobalSearch(String searchText) {
		Base.highLightElement(searchBar);
		searchBar.sendKeys(searchText);
		Base.highLightElement(sugOptions.get(0));
		sugOptions.get(0).click();

	}
	
	public void clickBascatIcon() {
		Base.highLightElement(bascatIcon);
		bascatIcon.click();
	}

}
