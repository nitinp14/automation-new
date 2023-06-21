package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageMethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
//		precondition maxmizing the browser
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		
//		fullscreen
		driver.manage().window().fullscreen();
//		postconditions
		driver.manage().window().maximize();
		
//		driver.close();
		driver.quit();
		
		
	}
}
