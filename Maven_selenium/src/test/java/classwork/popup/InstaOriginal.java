package classwork.popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaOriginal {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
		boolean login = driver.findElement(By.xpath("(//div[text()='Log in'])[1]")).isEnabled();
		System.out.println(login);
	}
}
