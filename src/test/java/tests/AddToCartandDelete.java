package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseDriverclass.Base;
import pageObjects.Loginpage;
import reusablemethods.ChildWindow;
import reusablemethods.ReusablemethodsHomepage1;

public class AddToCartandDelete extends Base{
	
	
	@Test
	public void searchproduct() throws InterruptedException
	{	
		Loginpage  lp = new Loginpage(driver);
		ReusablemethodsHomepage1 rr =new ReusablemethodsHomepage1(driver);
		ChildWindow cd = new ChildWindow(driver);
		
		rr.Enter_Element_in_SearchBox("Rich dad poor dad");
		rr.enter_Button();    //search and enter product 
		
    
		driver.findElement(By.xpath("(//span[contains(text(),'Rich Dad Poor Dad: 25th Anniversary Edit')])[1]")).click();
		Set<String> w = driver.getWindowHandles(); //contains ParentId and child id	
		Iterator<String> it = w.iterator();
		String parentId = it.next();
		String childId = it.next();	
		driver.switchTo().window(childId);
		
		
		rr.Addto_cart();
	//	driver.close();
		
		driver.switchTo().window(parentId);
		Thread.sleep(3000);
		rr.NavTo_Cart();
		Thread.sleep(3000);
		rr.Delete_from_cart();
		
		
		
	}
	
	
	
}





