package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		String pleaseIdentifyText = driver.findElement(By.id("headerContainer")).getText();
		System.out.println(pleaseIdentifyText);
		driver.quit();
	}
}
