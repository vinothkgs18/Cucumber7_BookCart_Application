package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookDetailPage{

	/*public BookDetailPage(WebDriver driver) {
		super(driver);
	}*/
	
	/*
	 * Single Ton--------------------------------------------------------
	 * 
	 */
	private static BookDetailPage bookDetailPage;
	private BookDetailPage() {}
	public static BookDetailPage getInstance() {
		if(bookDetailPage==null) {
			bookDetailPage=new BookDetailPage();
		}
		return bookDetailPage;
	}
	
	//-----------------------------------------------------------------
	@FindBy(xpath="//strong[text()='Title']//parent::td//following-sibling::td")
	public WebElement title;
	
	//------------------------------------------------------------------------------------------------------------
	
	public String getBookTitle() {
		Base.highLightElement(title);
		String text = title.getText();
		return text;
	}

	
	
}
