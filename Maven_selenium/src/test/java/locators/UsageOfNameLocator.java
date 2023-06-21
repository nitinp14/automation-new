package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNameLocator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
//		finding element by name attribute
		WebElement passwordtextField = driver.findElement(By.name("pwd"));
		passwordtextField.sendKeys("manager");
		driver.quit();
	}
}
