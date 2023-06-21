package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitButton {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		
		driver.findElement(By.name("btn_login")).submit();
		
		driver.quit();
	}
}
