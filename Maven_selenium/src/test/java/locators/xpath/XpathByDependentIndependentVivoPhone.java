package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;	

public class XpathByDependentIndependentVivoPhone {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=vivo&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		WebElement vivioPhone = driver.findElement(By.xpath("//div[text()='vivo T2x 5G (Aurora Gold, 128 GB)']/..//li[text()='8 GB RAM | 128 GB ROM']/../../../..//div[@class='_30jeq3 _1_WHN1']"));
		vivioPhone.click();
		driver.quit();
		
	}
}
