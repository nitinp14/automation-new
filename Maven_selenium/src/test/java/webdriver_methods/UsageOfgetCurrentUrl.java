package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
//		storing the url into a variable naming url.it will return string
//		getCurrentUrl will return current url in the form of string
		String URL = driver.getCurrentUrl();
		
//		printing the current url
		System.out.println(URL);
		
		driver.quit();
		
	}
}
