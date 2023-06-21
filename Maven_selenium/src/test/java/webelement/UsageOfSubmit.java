package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
//	driver.get("https://demo.opensourcebilling.org/en/");
	driver.get("https://demo.actitime.com/");
	
	
//	submit() is like click() ,but the type must be of submit
//	it should be inside <form> tag.
// att value	should be input or button tag.
	
//	driver.findElement(By.id("user_login_btn")).submit();
	driver.findElement(By.id("loginButton")).submit();
	driver.quit();
}
}
//NOTE:java.lang.UnsupportedOperationException: To submit an element, it must be nested inside a form element
