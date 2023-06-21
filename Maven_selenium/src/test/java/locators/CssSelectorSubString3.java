package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorSubString3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.cssSelector("input[type*='or']")).sendKeys("great");
		driver.quit();
		
	}
}
