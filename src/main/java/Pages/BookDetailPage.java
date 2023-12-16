package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookDetailPage extends Base{

	public BookDetailPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//strong[text()='Title']//parent::td//following-sibling::td")
	public WebElement title;
	
	//------------------------------------------------------------------------------------------------------------
	
	public String getBookTitle() {
		String text = title.getText();
		return text;
	}

	
	
}
