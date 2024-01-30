package classwork.popup;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshotEg {
	@Test
	public void textScreenshot() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot t= (TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File destination =new File("./screenshot/ss.png");
		FileUtils.copyFile(src, destination);
		driver.close();
	}
	
}
