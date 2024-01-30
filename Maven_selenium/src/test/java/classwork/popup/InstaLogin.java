package classwork.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//label)[1]")).sendKeys("nitin");
//		Thread.sleep(2000);
//	driver.findElement(By.xpath("(//label)[2]")).sendKeys("7894561");
		Thread.sleep(2000);
		var login = driver.findElement(By.xpath("//div[text()='Log in']")).isEnabled();
		boolean loginDisplayed = driver.findElement(By.xpath("//div[text()='Log in']")).isDisplayed();
		var a=10.0;
		System.out.println(a);
		
		System.out.println("enabled "+login);
		System.out.println("displayed "+loginDisplayed);
//		Thread.sleep(2000);
		
	}
}
