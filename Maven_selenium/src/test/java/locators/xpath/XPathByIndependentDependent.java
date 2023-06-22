package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByIndependentDependent {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone%2011&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
//		first we will find the xpath for static element then we go to common parent,
//		then we go to dynamic element
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']/../..//div[@class='_30jeq3 _1_WHN1']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
