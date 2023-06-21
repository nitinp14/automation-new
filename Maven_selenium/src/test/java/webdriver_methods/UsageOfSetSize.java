package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetSize {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
//		Dimension is a selenium class.
		Dimension reSize=new Dimension(1000,600);
		driver.manage().window().setSize(reSize);
		
		Thread.sleep(3000);
		driver.quit();
		
//		NOTE=whenever we are using setSize method we have to use dimesion type reference
//		which should be from selenium library
		
	}
}
