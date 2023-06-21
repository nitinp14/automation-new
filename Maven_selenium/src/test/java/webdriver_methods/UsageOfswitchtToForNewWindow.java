package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfswitchtToForNewWindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
//		switchTo method will return targetLocator
//		newWindow will return WebDriver
//		parameter--->WindowType will be of WINDOW (static final variable)
//		WindowType is of enum
		driver.switchTo().newWindow(WindowType.WINDOW);
		
//		triggering another URL in the new window
		driver.get("https://www.facebook.com/");
		
		driver.quit();
		
	}
}
