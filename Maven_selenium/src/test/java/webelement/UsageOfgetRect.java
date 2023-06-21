package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetRect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
//		getRect will return Rectangle ,its a class of selenium
//		it is a replacement of getLocation and getSize method.
//		it help us to find x,y coordinate of an element
//		also the height and width of the element
//		Rectangle class toString() is not overridden in String class,so if we try to print 
//		the reference name it will print the address.
		Rectangle allDimensionOfButton = driver.findElement(By.id("but2")).getRect();
		System.out.println(allDimensionOfButton);
		System.out.println("x axis of button= "+ allDimensionOfButton.getX());
		System.out.println("y axis of the button :"+ allDimensionOfButton.getY());
		System.out.println("height of the button is: "+allDimensionOfButton.height);
		System.out.println("width of the button is : "+allDimensionOfButton.width);
		
		driver.quit();
	}
}
