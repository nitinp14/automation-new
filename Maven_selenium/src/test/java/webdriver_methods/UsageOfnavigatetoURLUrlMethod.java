package webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfnavigatetoURLUrlMethod {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		
//		URL is a java class which takes String as argument.
//		and it takes url as argument and throws checkedException
		URL mainUrl = new URL("https://www.qspiders.com/");

//creating subUrls		
		URL batchUrl = new URL(mainUrl,"batches");
		
		URL courses = new URL(mainUrl, "courses");
		
//		to(URL url )is an overloaded method which takes url as argument
//		navigate() will return navigation interface
		driver.navigate().to(batchUrl);
		driver.navigate().to(courses);
		driver.quit();
	}
}
