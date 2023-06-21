package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorSubString1 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://facebook.com/");
		
//		cssSelector can also find the element by subString
//		syntax--css=<HTML tag><[attribute^=prefix of the string]>
//		^ : the symbol used to match a string using a prefix
//		Prefix: the string based on which the match operation is performed.
		driver.findElement(By.cssSelector("input[type^='pass']")).click();
		driver.quit();
		
	}
}
