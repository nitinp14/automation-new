package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetURL {
	public static void main(String[] args) {
		
//		instantiate the browser specific class
		WebDriver driver=new FirefoxDriver();
		
		
//		precondition -maximizing the browser
		driver.manage().window().maximize();
		
//		get method to trigger the url
		driver.get("https://www.facebook.com/login/");
		
//		making a variable,capturing the title and printing the title
		String title=driver.getTitle();
		System.out.println(title);
	
//	post condition minimising the browser and quitting it	
		driver.manage().window().minimize();
		driver.quit();
	}
}
