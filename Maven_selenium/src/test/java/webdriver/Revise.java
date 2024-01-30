package webdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Revise {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("nitin");
		driver.findElement(By.id("pass")).sendKeys("pawar");
		driver.findElement(By.name("login")).click();
		Set<Cookie> cooki = driver.manage().getCookies();
		for (Cookie c : cooki) {
			System.out.println(c);
		}
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.quit();
	}
}
