package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(Keys.CONTROL+"ac");
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).clear();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(5000);
		
		
		driver.quit();
	}
}
