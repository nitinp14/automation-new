package classwork.popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllChildBrowser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String pwh = driver.getWindowHandle();
		System.out.println(pwh);
		Set<String> allwh = driver.getWindowHandles();
		for(String all:allwh)
			
		{
			if(all.equals(pwh))
			{
				
			}
			else {
				driver.close();
			}
		}
	}

}
