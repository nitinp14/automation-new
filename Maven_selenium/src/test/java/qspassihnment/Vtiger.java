package qspassihnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.vtiger.com/");
		driver.findElement(By.xpath("(//a[contains(.,'Resources')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[1]")).click();
	 String phn = driver.findElement(By.xpath("//p[contains(.,' Bengaluru, India')]/../p[2]")).getText();
		System.out.println(phn);
		driver.quit();
	}
}
