package Stefdefination;

import Pages.BookDetailPage;
import Pages.Cartpage;
import Pages.CheckOutPage;
import Pages.Headerpage;
import Pages.HomePage;
import Pages.LoginPage;
import Util.DriverInstance;
import Util.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrder_SD {

	Headerpage headerPage =Headerpage.getInstance();
	
	LoginPage loginPage=LoginPage.getInstance();
	HomePage homePage =HomePage.getInstance();
	BookDetailPage bookDetailPage = BookDetailPage.getInstance();
	Cartpage cartPage = Cartpage.getInstance();
	CheckOutPage checkOutPage=CheckOutPage.getInstance();

	@Given("User can login the application")
	public void userCanLoginTheApplication() {
		headerPage.clickLoginLink();
		loginPage.doLogin("vinoth03", "Spring*123");
	}

	@When("User can add the books into the cart")
	public void userCanAddTheBooksIntoTheCart() throws InterruptedException {
		homePage.clickAddToCartIcon(Helper.generateRandomNumbers());
		Thread.sleep(4000);
		homePage.clickAddToCartIcon(Helper.generateRandomNumbers());
		Thread.sleep(4000);
		homePage.clickAddToCartIcon(Helper.generateRandomNumbers());
	}

	@When("User can go to cart and checkout the added items")
	public void userCanGoToCartAndCheckoutTheAddedItems() {
		headerPage.clickBascatIcon();
		cartPage.clickCheckoutButton();
	
	}

	@When("User can enter the shipping address and place the order")
	public void userCanEnterTheShippingAddressAndPlaceTheOrder() {
		checkOutPage.fillAddress();
		checkOutPage.clickCheckoutButton();
	}

	@Then("Verigy user get successfully message for placed order")
	public void verigyUserGetSuccessfullyMessageForPlacedOrder() {
		System.out.println("***********TBD************");
	}

}
