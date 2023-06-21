package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int count = allLinks.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			 WebElement links = allLinks.get(i);
			 String text = links.getText();
			System.out.println(text);
		}
		
		driver.quit();
	}
}
