package qspassihnment;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResumeUpload {
	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjwkeqkBhAnEiwA5U-uM5AFwDTLq3-w1_eC_vNRS-xniextIkxTMisn0XadDeYwRy-Q6zIccBoCU7AQAvD_BwE&gclsrc=aw.ds");
		Thread.sleep(3000);
		WebElement resume = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
//	resume.click();
	Thread.sleep(3000);
		File f=new File("./src/test/resources/nauk.pdf");
		String abPath = f.getAbsolutePath();
		Thread.sleep(3000);
		resume.sendKeys(abPath);
		Thread.sleep(3000);
//		driver.quit();
		
	}
}
