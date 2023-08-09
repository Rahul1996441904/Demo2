package reusablemethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class ChildWindow extends Base {
	
	WebDriver driver;
	public ChildWindow(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void childwindow()
	{
	
	Set<String> w = driver.getWindowHandles(); //contains ParentId and child id
	
	Iterator<String> it = w.iterator();
	
	String parentId = it.next();
	String childId = it.next();
	
	driver.switchTo().window(childId);
	
	}

	
	

}
