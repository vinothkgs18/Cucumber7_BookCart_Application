package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Headerpage extends Base {

	public Headerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

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
		loginLink.click();

	}

	public String gettingTextFromProfile() {
		String text = profileIcon.getText();
		return text;
	}

	public void doGlobalSearch(String searchText) {
		searchBar.sendKeys(searchText);
		sugOptions.get(0).click();

	}
	
	public void clickBascatIcon() {
		bascatIcon.click();
	}

}
