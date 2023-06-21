package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageisEnabled {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement textField = driver.findElement(By.id("APjFqb"));
	textField.sendKeys("ideaforge gmp");
	textField.sendKeys(Keys.ENTER);
	boolean nextLink = driver.findElement(By.id("pnnext")).isDisplayed();
	driver.findElement(By.id("pnnext")).click();
	System.out.println(nextLink);
	
		
	
}
}
