package classwork.popup;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectWithoutDuplicate {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Nitin/Desktop/Days.html");
		HashSet<String> hs=new HashSet<String>();
		WebElement allList = driver.findElement(By.id("a"));
		Select s=new Select(allList);
		List<WebElement> opt = s.getOptions();
//		for (WebElement e : opt) {
//			String text = opt.get(e).getText();
//			System.out.println(text);
//			hs.add(text);
//		}
		for(int i=0;i<opt.size();i++)
		{
			String text=opt.get(i).getText();
			System.out.println(text);
//			System.out.println(hs.add(text)); 
		
		}
		driver.close();
		
	}
}
