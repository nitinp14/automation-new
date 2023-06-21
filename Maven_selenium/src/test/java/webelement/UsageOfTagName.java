package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTagName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement tagName = driver.findElement(By.id("keepLoggedInCheckBox"));
		String checkBoxtagName = tagName.getTagName();
		System.out.println(checkBoxtagName);
		driver.quit();
	}
}
