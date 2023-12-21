package Stefdefination;

import org.testng.Assert;

import Pages.Headerpage;
import Pages.LoginPage;
import Util.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_SD extends DriverInstance {

	Headerpage headerPage = Headerpage.getInstance();

	LoginPage loginPage = LoginPage.getInstance();

	@Given("User click on login link on header page")
	public void user_click_on_login_link_on_header_page() {
		headerPage.clickLoginLink();
	}

	@When("Enter the username as {string} and password as {string} and click login button")
	public void enter_the_username_as_and_password_as_and_click_login_button(String string, String string2) {

		loginPage.doLogin(string, string2);
	}

	@Then("user login successfully")
	public void user_login_successfully() throws InterruptedException {
		System.out.println("THEN: user login successfully");
		String text = headerPage.gettingTextFromProfile();
		System.out.println(text);
		String exp = "vinoth01";
		if (text.contains(exp)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
