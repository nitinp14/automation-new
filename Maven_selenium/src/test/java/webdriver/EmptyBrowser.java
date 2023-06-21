package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBrowser {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	Thread.sleep(5000);
	driver.quit();
}
}
