package qspassihnment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentQspType {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("APjFqb")).sendKeys("qspider");
		Thread.sleep(7000);
		
		List<WebElement> allqsp = driver.findElements(By.xpath("//span[contains(text(),'qspider')]"));
		for(int i=0;i<allqsp.size();i++)
		{
			System.out.println(allqsp.get(i).getText());
			if(i==allqsp.size()-1)
			{
				allqsp.get(i).click();
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
