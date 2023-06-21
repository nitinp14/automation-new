package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfswitchToForNewTab {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
//		driver always controls one window/tab at a time
//		WindowType is of TAB(static final variable) type
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com/");
		
		driver.quit();
	}
}
