package Util;

import org.openqa.selenium.support.PageFactory;

import Pages.*;



public class CommonUtils {
	
	public void initPageFactory() {
		PageFactory.initElements(DriverInstance.getDriver(), BookDetailPage.getInstance());
		PageFactory.initElements(DriverInstance.getDriver(), Cartpage.getInstance());
		PageFactory.initElements(DriverInstance.getDriver(), CheckOutPage.getInstance());
		PageFactory.initElements(DriverInstance.getDriver(), Headerpage.getInstance());
		PageFactory.initElements(DriverInstance.getDriver(), HomePage.getInstance());
		PageFactory.initElements(DriverInstance.getDriver(), LoginPage.getInstance());
		PageFactory.initElements(DriverInstance.getDriver(), Registerpage.getInstance());
		
		

	}

}
