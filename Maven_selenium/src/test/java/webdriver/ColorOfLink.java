package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorOfLink {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		String color = driver.findElement(By.linkText("Forgotten account?")).getCssValue("color");
	System.out.println(color);
	
	String FontSize = driver.findElement(By.linkText("Forgotten account?")).getCssValue("font-size");
	
	System.out.println(FontSize);
	
	String FontFamily = driver.findElement(By.linkText("Forgotten account?")).getCssValue("font-family");
	
	System.out.println(FontFamily);
	driver.quit();
	}
}
