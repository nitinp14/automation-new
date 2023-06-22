package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=vivo&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		WebElement vivoPhone = driver.findElement(By.xpath("//div[text()='vivo T2x 5G (Glimmer Black, 128 GB)']/../descendant::li[contains(.,'8 GB RAM | 128 GB ROM')]/ancestor::div[@class='col col-7-12']/following-sibling::div/descendant::div[@class='_30jeq3 _1_WHN1']"));
		vivoPhone.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
