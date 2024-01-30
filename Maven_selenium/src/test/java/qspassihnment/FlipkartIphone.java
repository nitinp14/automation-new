package qspassihnment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartIphone {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(7000);
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'for products, brands')] "));
//		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.click();
		search.sendKeys("iphone 14 pro");
		Thread.sleep(4000);

		List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		for (WebElement e:allIphone)
		{
			System.out.println(e.getText());
		}
		 WebElement phone = driver.findElement(By.xpath("(//div[@class='lrtEPN _17d0yO'])[8]"));
		 phone.click();
		 
		Thread.sleep(5000);
		driver.quit();
	}
}
