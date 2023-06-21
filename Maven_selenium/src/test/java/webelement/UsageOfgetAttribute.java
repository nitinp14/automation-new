package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetAttribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
//		getattribute will display the att value ,we have to pass the att name in the constructor
		String userNameAtt = driver.findElement(By.id("username")).getAttribute("name");
		System.out.println(userNameAtt);
		driver.quit();
	}
}
