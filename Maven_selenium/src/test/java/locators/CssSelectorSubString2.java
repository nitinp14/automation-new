package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorSubString2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com/");
	
//	css=<HTML tag><[attribute$=suffix of the string]>
//	$: the symbol used to match a string using a suffix.
//	Suffix: the string based on which the match operation is performed
	driver.findElement(By.cssSelector("input[type$='word']")).sendKeys("passmaj");
	driver.quit();
	
}
}
