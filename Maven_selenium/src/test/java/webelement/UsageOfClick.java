package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		driver.quit();
	}
}
/*findElement is a method of searchContext interface
 * which returns WebElement 
 * By is a concrete method of findElement
 * 
 * 
 * */
