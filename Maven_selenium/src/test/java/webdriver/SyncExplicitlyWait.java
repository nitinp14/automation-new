package webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SyncExplicitlyWait {
	WebDriver driver;
	@Test
	
	public void WaitMethodsTest() throws Throwable, IOException
	{
	Properties prop=new Properties();
	prop.load(new FileInputStream("./src/test/resources/ActitimeData.properties"));

	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		driver=new ChromeDriver();
		
	}
	else if(browserName.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
	
	WebElement userNameTextField = driver.findElement(By.id("username"));
	userNameTextField.sendKeys("admin");
	driver.quit();
	
	}
}
