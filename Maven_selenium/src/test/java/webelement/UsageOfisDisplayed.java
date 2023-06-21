package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfisDisplayed {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
//		isDisplayed returns boolean value.
//		verifies if a certain element is present and displayed.
		boolean usernameDisplayed = driver.findElement(By.id("username")).isDisplayed();
		
		if(usernameDisplayed==true)
		{
			System.out.println("username textfield is displayed and verified");
		}
		else {
			System.out.println("username textfield is not displayed and it is verified");
		}
		driver.quit();
	}
}
