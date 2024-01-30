import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GDoubt {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://omayo.blogspot.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("a[title='Go to Blogger.com']")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
