package qspassihnment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllFlipkartLinks {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> allEle = driver.findElements(By.tagName("a"));
		
		for(WebElement e:allEle)
		{
//			System.out.println(e.getAttribute("href"));
			System.out.println(e.getText());
		}
		int count = allEle.size();
		System.out.println(count);
		driver.quit();
	}
//	getAttribute will print all the links present in the <a href>
//	in https format.
//	while getText will print the link text which is displayed in the webpage.
}
