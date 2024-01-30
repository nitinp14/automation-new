package classwork.popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Nitin/Desktop/Days.html");
		WebElement allList = driver.findElement(By.id("a"));
		Select s=new Select(allList);
		 
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByValue("fri");
		s.selectByVisibleText("sunday");
//		List<WebElement> opt = s.getOptions();
//		for (WebElement e : opt) {
//			System.out.println(e.getText());
//		}
		 String selectedOptions = s.getFirstSelectedOption().getText();
		System.out.println(selectedOptions);
		List<WebElement> twoSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : twoSelectedOptions) {
			System.out.println(webElement.getText());
		}
		 String all = s.getWrappedElement().getText();
		System.out.println(all);
		driver.close();
	}
}
