package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForgottenPassword {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
	
		String Forgot = driver.findElement(By.xpath("//a[text()='Forgotten account?']")).getText();
		System.out.println(Forgot);
	
	driver.quit();
	}
	
	
}
