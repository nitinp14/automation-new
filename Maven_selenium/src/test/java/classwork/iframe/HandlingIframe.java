package classwork.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nitin/Desktop/page1.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("d");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("gupta l");
		Thread.sleep(4000);
		driver.quit();		
	}
}
