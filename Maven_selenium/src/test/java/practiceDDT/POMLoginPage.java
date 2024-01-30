package practiceDDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMLoginPage {
	
	@FindBy(id="username")
	WebElement ubox;

	@FindBy(name="pwd")
	WebElement pbox;
	
	@FindBy(id="loginButton")
	WebElement lbutton;
	
	@Test
	public void set(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@Test
	public void setLoginPage(String un,String pw)
	{
		ubox.sendKeys(un);
		pbox.sendKeys(pw);
		lbutton.click();
	}
	
}
