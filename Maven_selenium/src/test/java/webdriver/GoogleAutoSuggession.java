package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggession {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		
		Thread.sleep(2000);
		List<WebElement> suggessions = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
		
		for(int i=0;i<suggessions.size();i++)
		{
			WebElement allSugg = suggessions.get(i);
			String texts = allSugg.getText();
			System.out.println(texts);
			
		}
		
		driver.quit();
	}
}
