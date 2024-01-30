package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByMethods {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement dropdown = driver.findElement(By.id("drop1"));
//		 select class constructor takes parameter as webElement.
//		 we can only use select class methods if it is made with SELECT TAG
//it will show UnExpectedTagNameException		 
		 Select s=new Select(dropdown);
		 Thread.sleep(3000);
		 s.selectByIndex(1); //method
		 Thread.sleep(3000);
		 
		 s.selectByValue("ghi");//method,string as argument
		 Thread.sleep(3000);
		 
		 s.selectByVisibleText("doc 3");//method,string as argument
		 Thread.sleep(3000); 
		 
		 driver.quit();
		 
		 
	}
}
