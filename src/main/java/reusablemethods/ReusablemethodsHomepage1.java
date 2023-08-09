package reusablemethods;

 


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ReusablemethodsHomepage1 {
	
	
	 WebDriver driver;
	public ReusablemethodsHomepage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="twotabsearchtextbox")
	WebElement searchElement;
	public void Enter_Element_in_SearchBox(String name)
	{
		searchElement.sendKeys(name);
			
	}
	
	@FindBy(id="nav-search-submit-button")
	WebElement enterbutton;
	public void enter_Button()
	{
		enterbutton.click();
	}
	
	@FindBy(id="buy-now-button")
	WebElement BuyNow;
	public void buynow ()
	{
		BuyNow.click();
	}

	public void scrolldown1()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy (200,200)");
	}
	
	@FindBy(id="add-to-cart-button")
	WebElement AddtoCart;
	public void Addto_cart ()
	{
		AddtoCart.click();
	}
	
	public void wait1()
	{
		   // Wait until the search results are visible
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".s-result-item[data-asin]")));
	}
	
	@FindBy(id="nav-cart-count")
	WebElement NavToCart;
	public void NavTo_Cart ()
	{
		NavToCart.click();
	}
	
	
//	@FindBy(xpath="(//span[@class='a-size-small sc-action-delete'])[1]")  
	
	@FindBy(xpath="//input[contains(@name,'submit.delete')]")
	
	WebElement Delete_from_Cart;
	public void Delete_from_cart()
	{
		Delete_from_Cart.click();
	}

	

	
	
	

}
