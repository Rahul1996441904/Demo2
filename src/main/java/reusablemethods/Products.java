package reusablemethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Products  {
	
	WebDriver driver;
	public Products(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(className="//h2[contains(@class,'size-mini a-spacing-none a-color-base")
	WebElement product;
	public void iphone14()
	{
		product.click();
	}
	
	
	
	@FindBy(xpath="(//input[@name=\"submit.buy-now\"])[2]")
	WebElement buybutton;
	public void buy()
	{
		buybutton.click();
	}
	
	public void iphones()
	{
		 List<WebElement> iphones=driver.findElements(By.xpath("//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"])"));
		 
		 for(int i=0;i<iphones.size();i++)
		 {
			System.out.println(i); 
		 }
	}
	
	
	
	
	

}
