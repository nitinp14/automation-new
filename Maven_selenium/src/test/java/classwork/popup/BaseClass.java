package classwork.popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Open Browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close Browser",true);
		driver.close();
		
	}
	@BeforeClass
	public void login()
	{
		Reporter.log("login",true);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
	}
	@AfterMethod()
	
		public void logout()
		{
		Reporter.log("logout",true);
		
		}
	}

