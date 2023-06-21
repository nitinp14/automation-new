package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfPAgeSource {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
//		getPageSorce will return all the sourcecode,in the form of string
		
		String pageSource = driver.getPageSource();
		
//		printing the sourceCode
		System.out.println(pageSource);
		
		driver.quit();
	}
}
