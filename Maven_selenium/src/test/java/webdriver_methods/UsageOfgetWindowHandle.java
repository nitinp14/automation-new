package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
//		getWindowHandle will return the current windowId in the form of String
//		making a variable to store the window id
		
		String windowId = driver.getWindowHandle();
		
//		printing the windowId
		System.out.println(windowId);
		
		driver.quit();
	}
}
