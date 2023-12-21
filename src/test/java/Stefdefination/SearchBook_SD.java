package Stefdefination;

import org.testng.Assert;

import Pages.BookDetailPage;
import Pages.Cartpage;
import Pages.Headerpage;
import Pages.HomePage;
import Util.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBook_SD {
	public Headerpage hp = Headerpage.getInstance();
	public HomePage hop = HomePage.getInstance();
	public BookDetailPage bp = BookDetailPage.getInstance();
	public Cartpage cp= Cartpage.getInstance();
	public String bookName = "HP5";

	@Given("User can search the book in header search bar")
	public void user_can_search_the_book_in_header_search_bar() {
		
		hp.doGlobalSearch(bookName);
	}

	@When("User click on the top of image once search results on the page")
	public void user_click_on_the_top_of_image_once_search_results_on_the_page() {
		
		hop.clickSearchResult(0);

	}

	@Then("Verify book title in the book details page")
	public void verify_book_title_in_the_book_details_page() {
		
		String text = bp.getBookTitle();
		Assert.assertEquals(text, bookName);

	}

	@Given("User can search the {string} in header search bar")
	public void user_can_search_the_in_header_search_bar(String string) {
		
		hp.doGlobalSearch(string);
	}

	@Then("Verify {string} title in the book details page")
	public void verify_title_in_the_book_details_page(String string) {
		
		String text = bp.getBookTitle();
		Assert.assertEquals(text, string);

	}

	@Given("User can search the book as {string} in header search bar")
	public void user_can_search_the_book_as_in_header_search_bar(String string) {
	
		hp.doGlobalSearch(string);
	}

	@When("User click on the add to cart button on the search result")
	public void user_click_on_the_add_to_cart_button_on_the_search_result() throws InterruptedException {
		Thread.sleep(2000);
		
		hop.clickAddToCartIcon(0);
	}

	@When("User can click the Cart icon \\(trolly icon) on the header")
	public void user_can_click_the_cart_icon_trolly_icon_on_the_header() {
	
		hp.clickBascatIcon();
	}

	@Then("Verify the book {string} title that added in the cart")
	public void verify_the_book_title_that_added_in_the_cart(String string) {
		
		String textFromBookTitle_cartItem = cp.getTextFromBookTitle_cartItem(0);
		Assert.assertEquals(string, textFromBookTitle_cartItem);
		
	
	}

	@Then("User can clear the cart")
	public void user_can_clear_the_cart() {
		
		cp.clickClearCartButton();
	}

}
