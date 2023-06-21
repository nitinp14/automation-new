package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
//		getLocation fetch the relative position of the webElement.
//		returns Point,Point is a selenium class 
//		it will return getX and getY
//		point class toString method is overriden in string class
		Point textField = driver.findElement(By.id("ta1")).getLocation();
		System.out.println(textField);
		driver.quit();
		
	}
}
