package classwork.popup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Nitin/Desktop/Naukri.html");
		Thread.sleep(3000);
		File f=new File("./src/test/resources/Resume.docx");
		String abPath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(abPath);
		
	}
}
