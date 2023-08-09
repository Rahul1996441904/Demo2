package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test ;

import baseDriverclass.Base;
import pageObjects.Loginpage;
import reusablemethods.ChildWindow;
import reusablemethods.ReusablemethodsHomepage1;

public class SearchandOrder2 extends Base{


	@Test
	public void searchproduct() throws InterruptedException
	{	
		Loginpage  lp = new Loginpage(driver);
		ReusablemethodsHomepage1 rr =new ReusablemethodsHomepage1(driver);
		ChildWindow cd = new ChildWindow(driver);
		
		rr.Enter_Element_in_SearchBox("Rich dad poor dad");
		rr.enter_Button();    //search and enter product 
		
		driver.findElement(By.xpath("//img[@alt=\"Rich Dad Poor Dad: 25th Anniversary Edit\"]")).click();
		
		cd.childwindow();
		rr.buynow();
		lp.EntermailAndpassword("rahulpetkar24@gmail.com", "@Rahul441904$");
		lp.signin();
		
		
		
}
}