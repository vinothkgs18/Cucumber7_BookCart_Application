package Stefdefination;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Pages.LoginPage;
import Pages.Registerpage;
import Util.DriverInstance;
import Util.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_SD{

	//public Registerpage rg = new Registerpage(DriverInstance.getDriver());
	//public LoginPage l = new LoginPage(DriverInstance.getDriver());
	
	Registerpage registerpage=Registerpage.getInstance();
	LoginPage loginPage=LoginPage.getInstance();

	@Given("User click on register button in login page")
	public void user_click_on_register_button_in_login_page() {
		
		loginPage.clickRegisterButton();

	}

	@When("User enter the {string} {string} {string} {string} and click register button")
	public void user_enter_the_and_click_register_button(String string, String string2, String string3,
			String string4) {
	
		registerpage.doRegisterUser(string, string2, string3, string4);
	}

	@Then("Verify user register successgully")
	public void verify_user_register_successgully() {
		String text = loginPage.getText_login();

		Assert.assertEquals(text, "Login");

	}

	@When("User enter the first name last name user name and password as random data and click register button")
	public void user_enter_the_first_name_last_name_user_name_and_password_as_random_data_and_click_register_button() {

		String string = Helper.generateRandomText();
		String string2 = Helper.generateRandomText();
		String string3 = Helper.generateRandomText();
		String string4 = "Spring*123";
		registerpage.doRegisterUser(string, string2, string3, string4);
	}
	
	@When("User enter the all required field")
	public void user_enter_the_all_required_field(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> mp = dataTable.asMaps();
		for(int i=0;i<mp.size();i++) {
		String string = mp.get(i).get("FirstName");
		String string2 = mp.get(i).get("LastName");
		String string3 = mp.get(i).get("UserName");
		String string4 = mp.get(i).get("Password");
		
		registerpage.doRegisterUser(string, string2, string3, string4);
		}
	}

}
