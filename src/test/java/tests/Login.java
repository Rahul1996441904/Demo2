package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseDriverclass.Base;
import pageObjects.Loginpage;


public class Login extends Base {



	
	

	@Test(dataProvider = "getdata")
	public void UserLogin(String email, String Password) throws InterruptedException 
	{
		Loginpage lo = new Loginpage(driver);
		lo.loginbutton();
		lo.EntermailAndpassword(email, Password);
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] obj = new Object[][] { { "rahulpetkar24@gmail.com", "@Rahul441904$" },{"rahulpetkar24@gmail.com", "@Rahul44190" }};

		return obj;
	}

}
