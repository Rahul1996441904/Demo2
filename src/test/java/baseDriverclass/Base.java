package baseDriverclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusablemethods.ReusablemethodsHomepage1;

public class Base {
	


	public  WebDriver driver;
	


	@BeforeMethod	(alwaysRun = true)
	public void initilizedriver() throws IOException {

		Properties ps = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Rahul Patekar\\eclipse-workspace\\Amazon\\src\\test\\java\\baseDriverclass\\Browsers.properties");
		ps.load(fis);
		String Browsername = ps.getProperty("Browser");
		
		if (Browsername.equalsIgnoreCase("Edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		

	}


	
	@AfterMethod
	(alwaysRun = true)
	public void close() 
	{
		//driver.close();
	}


}
