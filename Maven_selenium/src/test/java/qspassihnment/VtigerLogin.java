package qspassihnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.vtiger.com/");
		
		Actions a=new Actions(driver);
		
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(resources).perform();
//		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Customers")).click();
//		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.id("loginspan"));
//		Thread.sleep(5000);
			
		a.doubleClick(loginButton).perform();
//		Thread.sleep(5000);
		String title = driver.getTitle();
		if (title.equals("Login - Vtiger")) {
			System.out.println("title is correct and it is verified");
		}
		else {
			System.out.println("title is wrong and it is verified");
		}
		driver.quit();
	}
}
