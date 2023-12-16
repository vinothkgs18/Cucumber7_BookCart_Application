package Pages_donot_use;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Util.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Body extends DriverInstance{
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	public List<WebElement>addToCartButtons;
	
	@FindBy(tagName="img")
	public WebElement test;
	
	@FindBy(tagName="mat-list-item")
	public List<WebElement>filters;
	
	@FindBy(tagName="img")
	public List<WebElement> searchResult;
	
	
	
	@When("User clik the add to cart button in the search result")
	public void user_clik_the_add_to_cart_button_in_the_search_result() {
	   addToCartButtons.get(0).click();
	}
	
	
	@Given("User click on filters value {string}")
	public void user_click_on_filters_value(String string) throws InterruptedException {
		test.click();
		filters.get(0).click();
	   
	}
	
	@When("User click on any result")
	public void user_click_on_any_result() {
	    searchResult.get(2).click();
	}
	
	
	@Then("Verify the Catagery that match to the filters value")
	public void verify_the_catagery_that_match_to_the_filters_value() {
	    
	}

}
