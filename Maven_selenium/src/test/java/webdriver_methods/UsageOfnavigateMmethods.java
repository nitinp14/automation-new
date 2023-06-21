package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfnavigateMmethods {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.get("https://www.facebook.com/");
	
//navigate has 5 methods and we are executing the one by one given below	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
//	to(String url) will internally calls get(String url) method 
	driver.navigate().to("https://www.google.com/");
	driver.quit();
	
}
}
