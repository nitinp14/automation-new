import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuptakaDoubt {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("a[title='Go to Blogger.com']")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
