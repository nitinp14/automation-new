package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver = new ChromeDriver();

	@Test
	public void dropDownSelectTest() throws Throwable {
		driver.get("https://en-gb.facebook.com/reg/");
		WebElement listOfName = driver.findElement(By.id("month"));
		Select s = new Select(listOfName);
		Thread.sleep(2000);
 
		s.selectByValue("1");
		Thread.sleep(2000);
		s.selectByIndex(2);

		Thread.sleep(2000);

		s.selectByVisibleText("Feb");
		Thread.sleep(3000);

		new Demo().click();
	}

	public void click() throws InterruptedException {
		driver.get("https://en-gb.facebook.com/reg/");
		driver.findElement(By.name("firstname")).sendKeys("nitin");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("pawar");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit"));
		Thread.sleep(2000);
//		driver.quit();

	}

}
