package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _agiv img']")).isDisplayed();
		
		
		if(logo==true)
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		
		boolean Button = driver.findElement(By.xpath("//label[text()='Female']/../input[@class='_8esa']")).isEnabled();
		
		if(Button==true)
		{
			System.out.println("is enabled");
		}
		
		else
		{
			System.out.println("not enabled");
		}
		
	 boolean Button1 = driver.findElement(By.xpath("//label[text()='Female']/../input[@class='_8esa']")).isSelected();
		
	 if(Button1==true)
	 {
		 System.out.println("is selected");
	 }
	 
	 else
	 {
		 System.out.println("not selected");
	 }
		driver.quit();
	}
}
