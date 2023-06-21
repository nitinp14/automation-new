package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbSignUpLocation {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg/");
		
		int Female = driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
		
		
		int male = driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		
		
		System.out.println(Female);
		System.out.println(male);
		
		if(Female==male)
		{
			System.out.println("alligned ");
		}
		else
		{
			System.out.println("not alligned");
		}
		
		
		driver.quit();
	}
}
