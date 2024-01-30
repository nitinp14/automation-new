package qspassihnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PolicyAutomate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.cssSelector("select[class='ui-datepicker-month']"));
		
		Select s=new Select(month);
		s.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s1=new Select(year);
		s1.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//a[text()='14']")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		Thread.sleep(4000);
		driver.findElement(By.id("renew_policy_submit")).click();
	Thread.sleep(4000);
		String text = driver.findElement(By.cssSelector("span[id='policynumberError']")).getText();
		System.out.println(text);
		if(text.equals("Please enter valid Policy No."))
		{
			System.out.println("sahi");
		}
		else {
			{
				System.out.println("galat");
			}
		}
		driver.quit();
		
		
}
}
