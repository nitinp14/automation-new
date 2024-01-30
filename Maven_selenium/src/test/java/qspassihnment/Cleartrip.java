package qspassihnment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Cleartrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("BLR");
		driver.findElement(By.xpath("//P[.='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("GOA");
		driver.findElement(By.xpath("//p[.='Goa, IN - Manohar International Airport (GOX)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
		Thread.sleep(3000);
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scollBy(0,300)");
		driver.findElement(By.xpath("(//div[text()='25'])[1]")).click();
		driver.findElement(By.xpath("//span[.='Search flights']")).click();
		List<WebElement> flightName = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']"));
		List<WebElement> departure = driver.findElements(By.xpath("//p[@class='m-0 fs-5 fw-400 c-neutral-900']/.."));
		for(int i=0;i<flightName.size();i++)
		{
			System.out.println((flightName.get(i).getText())+departure.get(i).getText());
		}
		
		driver.quit();
	}
}
