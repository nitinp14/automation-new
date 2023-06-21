package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
//		getTitle will return the title in the form of string.
//		making a variable naming title and storing it 
		String title = driver.getTitle();
		
//		printing the title
		System.out.println(title);
		driver.quit();
	}
}
