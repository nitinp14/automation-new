package qspassihnment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobsLinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs"+Keys.ENTER);
		Thread.sleep(7000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[contains(.,'wipro')]"));
		Thread.sleep(2000);
		System.out.println(allLinks.size());
		for (WebElement e:allLinks)
		{
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
