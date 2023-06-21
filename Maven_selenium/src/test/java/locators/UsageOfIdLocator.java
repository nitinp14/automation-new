package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIdLocator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
//		finding by id attribute
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("admin");
		driver.quit();
		
	}
}
