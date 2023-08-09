package pageObjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Loginpage extends Base  {
	
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{	
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(id="ap_email")
	WebElement Email;
	@FindBy(id ="continue")
	WebElement Continue;
	@FindBy(id ="ap_password")
	WebElement Password;
	
	public void EntermailAndpassword(String email,String password) throws InterruptedException
	{
		Email.sendKeys(email);
		Thread.sleep(2000);
		Continue.click();
		Thread.sleep(2000);
		Password.sendKeys(password);
		
	}
	
	@FindBy(id="nav-link-accountList")
	WebElement login;
	public void loginbutton()
	{
		login.click();
	//	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	}
	
	@FindBy(id="signInSubmit")
	WebElement SignIN;
	public void signin()
	{
		SignIN.click();
	
	}
	
	
	

}
