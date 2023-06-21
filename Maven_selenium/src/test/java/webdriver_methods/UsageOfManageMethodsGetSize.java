package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageMethodsGetSize {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension sizeOfTheWindow = driver.manage().window().getSize();
		
//		Dimension is a selenium class which has 2 methods getWidth,getHeight
//		return type is int.
		int widthOfWindow = sizeOfTheWindow.getWidth();
		
		
		int heightOfWindow = sizeOfTheWindow.getHeight();
		System.out.println(sizeOfTheWindow);
		
//		printing the dimensions of the browser window
		System.out.println("Width is = "+widthOfWindow);
		System.out.println("Height is = "+heightOfWindow);
		driver.quit();
		
	}
}
