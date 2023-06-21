package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLocation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		int UsernameX = driver.findElement(By.id("username")).getLocation().getX();
		
	 int PasswordX = driver.findElement(By.name("pwd")).getLocation().getX();
	 
	 System.out.println(UsernameX);
		System.out.println(PasswordX);
		
		if(UsernameX==PasswordX)
		{
			System.out.println("same allignment");
		}
		else
		{
			System.out.println("not alligned");
		}
		
		driver.quit();
	}
}
