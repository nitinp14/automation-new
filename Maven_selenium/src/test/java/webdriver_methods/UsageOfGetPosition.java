package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPosition {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		/*whenever we are using maximizing are precondition we will get -8 -8 as output
		 * 
		 */
//		driver.manage().window().maximize();
			
//		Point is a selenium class.getPsition() returns Point
		Point positionOfWindow = driver.manage().window().getPosition();
		System.out.println(positionOfWindow);
		
//	Point class contains two methods getX,getY
//		these methods returns int
		int xAxis = positionOfWindow.getX();
		int yAxis = positionOfWindow.getY();
		
		System.out.println(xAxis);
		System.out.println(yAxis);
		driver.quit();
		

		
	}
}
