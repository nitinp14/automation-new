package practiceDDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLoginActitimeVioaDDT {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("HD_001fd");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Banking Project");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='- Select Customer -'])[1]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='searchItemList']//div[text()='Big Bang Company']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logoutLink")).click();
//		Thread.sleep(5000);
		
		
driver.quit();
	}
}
