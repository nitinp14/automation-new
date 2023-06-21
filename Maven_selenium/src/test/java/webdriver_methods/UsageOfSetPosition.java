package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetPosition {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Point newStartingPoint = new Point(400,500);
		

		driver.manage().window().setPosition(newStartingPoint);
		
		driver.quit();
		}
}

/*
 * Whenever we are using setPosition()we have to create the object of Point class
 * which is present inside the selenium library.
 * we have to pass the reference in the contructor. 
 * it will set the new position of the browser.
*/