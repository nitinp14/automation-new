package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
	public static void main(String[] args) {
		
//instanciate the browser specific class
		WebDriver driver=new ChromeDriver();
		
//		pass the URL of website
		driver.get("https://instagram.com/");
		
//		postcondition for closing the browser
		driver.quit();
		
	}
}
