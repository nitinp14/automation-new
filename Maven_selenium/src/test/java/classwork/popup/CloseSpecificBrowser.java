package classwork.popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();

		Set<String> allw = driver.getWindowHandles();
		int count = allw.size();
		for(String s:allw)
		{
			String title = driver.switchTo().window(s).getTitle();

			if(title.contains("Apple"))
			{
				driver.close();
			}


		}
	}
}
