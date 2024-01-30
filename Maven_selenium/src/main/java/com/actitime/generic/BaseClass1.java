package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {
	public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("open browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("close Browser",true);
		driver.close();
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	@AfterMethod
	
		public void logout()
		{
			Reporter.log("logout",true);
			
			WebElement logoutButton = driver.findElement(By.id("logoutLink"));
			logoutButton.click();
		}
	}

