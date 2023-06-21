package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfPArtialLinkTextLocator {
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
//	the text which we have written is the TAGTEXT not the text written within the href value
//	link text  and partial are both case sensitive in nature
	driver.findElement(By.partialLinkText("in")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
