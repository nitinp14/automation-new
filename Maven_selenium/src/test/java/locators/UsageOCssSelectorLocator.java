package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOCssSelectorLocator {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement createPageLinkTag = driver.findElement(By.cssSelector("a[class='_8esh']"));
		createPageLinkTag.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}
}
