package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		int emailHeight = driver.findElement(By.id("email")).getSize().getHeight();
		int emailWidth = driver.findElement(By.id("email")).getSize().getWidth();
		
		int PasswordHeight = driver.findElement(By.id("pass")).getSize().getHeight();
		int Passwordwidth = driver.findElement(By.id("pass")).getSize().getWidth();
		
		System.out.println("email height="+emailHeight);
		
		System.out.println("password height="+PasswordHeight);
		
		System.out.println("email width="+emailWidth);
		
		System.out.println("password width"+Passwordwidth);
		
		if(emailHeight==PasswordHeight)
		{
			System.out.println("same height");
			
		}
		else
		{
			System.out.println("diff heights");
		}
		if(emailWidth==Passwordwidth)
		{
			System.out.println("same width");
		}
		else
		{
			System.out.println("diff width");
		}
		
		driver.quit();
	}
}
