package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		int emailXAxis = driver.findElement(By.id("email")).getLocation().getX();
		
		int PwdXAxis = driver.findElement(By.id("pass")).getLocation().getX();
		
		System.out.println(emailXAxis);
		
		System.out.println(PwdXAxis);
		
		driver.quit();
	}
}
