package classwork.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.cssSelector("button[class='btn btn-danger']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
