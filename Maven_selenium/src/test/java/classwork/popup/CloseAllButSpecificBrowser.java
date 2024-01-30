package classwork.popup;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllButSpecificBrowser {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/auth");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String all:allwh)
		{
			Thread.sleep(3000);
			String title = driver.switchTo().window(all).getTitle();
			Thread.sleep(3000);
			if(title.contains("Google"))
			{

			}
			else {
				driver.close();
			}
		}
	}
}
