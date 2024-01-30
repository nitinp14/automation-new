package qspassihnment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTProperty {
	public static void main(String[] args) throws IOException {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
	FileInputStream fis=new FileInputStream("C:\\Users\\Nitin\\git\\AutomationProject\\Maven_selenium\\src\\test\\java\\qspassihnment\\data\\actitime.property");
	Properties p=new Properties();
	p.load(fis);
	String url=p.getProperty("url");
	String un = p.getProperty("username");
	String pw = p.getProperty("password");
	System.out.println(un);
	
	
	
	}
}
