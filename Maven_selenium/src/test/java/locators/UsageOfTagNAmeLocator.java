package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTagNAmeLocator {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.actitime.com/");
		
//		alternate way to trigger the url
		driver.navigate().to("https://demo.actitime.com/");
		driver.findElement(By.tagName("a")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
