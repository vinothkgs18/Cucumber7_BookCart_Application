package Pages_donot_use;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Util.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Header extends DriverInstance {

	/*
	 * @FindBy(xpath="//span[text()='Login']") public WebElement loginLink;
	 * 
	 * @FindBy(
	 * xpath="(//button[@class='mat-focus-indicator mat-menu-trigger mat-button mat-button-base ng-star-inserted']//span)[1]"
	 * ) public WebElement profileIcon;
	 * 
	 * 
	 * 
	 * 
	 * @Given("click on login link") public void click_on_login_link() {
	 * PageFactory.initElements(driver, this); loginLink.click();
	 * 
	 * }
	 * 
	 * @Then("user get login successfully") public void
	 * user_get_login_successfully() { String text = profileIcon.getText();
	 * Assert.assertEquals(text, "vinoth01"); }
	 */

	// without page factory

	@Given("User click on login link")
	public void click_on_login_link() {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

	@Then("user get login successfully")
	public void user_get_login_successfully() {
		WebElement profileIcon = driver.findElement(By.xpath(
				"(//button[@class='mat-focus-indicator mat-menu-trigger mat-button mat-button-base ng-star-inserted']//span)[1]"));
		String text = profileIcon.getText();
		if (text.contains("vinoth01")) {
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
		}

		System.out.println("Login successfuly!!  " + text);
	}

	@Given("User search the book {string} in the search bar and select the suggested options")
	public void user_search_the_book_in_the_search_bar_and_select_the_suggested_options(String searchText) {
		driver.findElement(By.tagName("input")).sendKeys(searchText);
		List<WebElement> searchsuggestion = driver.findElements(By.tagName("mat-option"));
		searchsuggestion.get(0).click();
	}

	

	@Then("Verify books are added in the cart list")
	public void verify_books_are_added_in_the_cart_list() {
		driver.findElement(
				By.xpath("//button[@class='mat-focus-indicator mat-icon-button mat-button-base']//span[@class='mat-button-wrapper']")).click();
		List<WebElement> bookListinCart = driver.findElements(By.xpath("//td//a"));
		for (int i = 0; i < bookListinCart.size(); i++) {
			System.out.println(bookListinCart.get(i).getText());
		}
	}

}
