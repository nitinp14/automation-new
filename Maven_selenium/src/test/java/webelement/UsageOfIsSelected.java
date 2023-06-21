package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		 driver.findElement(By.id("keepLoggedInCheckBox")).click();
		 
//		 isSelected returns boolean value only.
//		 it checks whether the element is selected or not.
		boolean checkBoxSelected = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(checkBoxSelected);
		driver.quit();
		
	}
}
