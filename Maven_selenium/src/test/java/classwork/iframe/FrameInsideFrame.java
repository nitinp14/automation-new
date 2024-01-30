package classwork.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInsideFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nitin/Desktop/page1.html");
		driver.manage().window().maximize();
		TargetLocator s = driver.switchTo();
		s.frame("f1");
		s.frame("f2");
		driver.findElement(By.id("t3")).sendKeys("vipin");
		Thread.sleep(2000);
		driver.quit();
	}
}
