package qspassihnment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCHeadlines {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/news/business");
		List<WebElement> news = driver.findElements(By.tagName("h3"));
		for (WebElement allNews : news) {
			System.out.println(allNews.getText());
		}
	}
}
