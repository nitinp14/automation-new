package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetWindowHandles {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
//		switching to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		
//		getWindowHandles will return the window ids in the form set<String> 
		Set<String> WindowIds = driver.getWindowHandles();
		
//		printing all the window ids
		System.out.println(WindowIds);
		
		for(String s:WindowIds)
		{
			System.out.println(s);
		}
		driver.quit();		
	}
}
