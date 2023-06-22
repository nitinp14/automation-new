package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
//		we need to give anchor tag for clicking purpose
		WebElement sensex = driver.findElement(By.xpath("//div[@class='leftcontainer']/descendant::div[@id='div_bseindices']//ul[2]/li[1]/a"));
		sensex.click();
		driver.quit();
	}
}
