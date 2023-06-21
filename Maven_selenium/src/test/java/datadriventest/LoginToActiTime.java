package datadriventest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginToActiTime {
	WebDriver driver;
	
	@Test
	public void loginTest() throws Throwable
	{
		//file loading object 
		FileInputStream fis = new FileInputStream("./src/test/resources/ActitimeData.properties");
		//properties object
		Properties propertiesObject = new Properties();
		//load the fis object to the program
		propertiesObject.load(fis);
		//fetching the method from the property class to get the value from the keys
		String browser = propertiesObject.getProperty("browser");
		System.out.println(browser);
		//checking the browser value and create browser instance
		if (browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		//pre condition
		driver.manage().window().maximize();
		//get url method
		driver.get(propertiesObject.getProperty("url"));
		//username select and pass value
		driver.findElement(By.id("username")).sendKeys(propertiesObject.getProperty("username"));
		//password select and pass value
		driver.findElement(By.name("pwd")).sendKeys(propertiesObject.getProperty("password"));
		//login button
		driver.findElement(By.id("loginButton")).click();
		//wait for check the functionality
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Thread.sleep(4000);
		//post condition
		driver.quit();
	}
}
