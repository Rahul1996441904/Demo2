package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import baseDriverclass.Base;
import reusablemethods.ChildWindow;
import reusablemethods.Products;
import reusablemethods.ReusablemethodsHomepage1;

public class SearchandOrder extends Base{





	@Test
	public void searchproduct() throws InterruptedException
	{	
		ReusablemethodsHomepage1 rr =new ReusablemethodsHomepage1(driver);
		rr.Enter_Element_in_SearchBox("i phone 14");
		rr.enter_Button();                           //search and enter product  

		// Wait until the search results are visible
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h2[contains(@class,'a-size-mini a-spacing-none a-color-base s-line-clamp-2')]")));


		//	List<WebElement> iphones = driver.findElements(By.cssSelector(".s-result-item[data-asin]"));

		List<WebElement> iphones1 = driver.findElements(By.xpath("//h2[contains(@class,'a-size-mini a-spacing-none a-color-base s-line-clamp-2')]"));

		for(int i=0;i<iphones1.size();i++)
		{
			System.out.println(	iphones1.get(i).getText());


			iphones1.get(1).click();
		

		}




	}


}




