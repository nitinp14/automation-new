package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetCssValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
//		getCssValue return string and it will fetch the cssValue from the webpage
		String fontName = driver.findElement(By.id("loginButton")).getCssValue("font-family");
		System.out.println(fontName);
		driver.quit();
		}
}
