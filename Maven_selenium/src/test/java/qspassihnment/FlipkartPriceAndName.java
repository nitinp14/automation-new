package qspassihnment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPriceAndName {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("q")).sendKeys("poco m4"+Keys.ENTER);
//		List<WebElement> names = driver.findElements(By.className("_4rR01T"));
//		List<WebElement> prices = driver.findElements(By.className("_30jeq3 _1_WHN1"));
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='_4rR01T']|//div[@class='_30jeq3 _1_WHN1']"));
		
		for (WebElement e : all) {
			System.out.println(e.getText());
			
		}
		driver.quit();
	}
}
