package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GetFirstLastMethod extends OmayoBaseClass {
	
	private Select s;
	private WebElement dropboxElement;
	@Test
	public void first()
	{
		
		dropboxElement =driver.findElement(By.id("drop1"));
		s=new Select(dropboxElement);
		String text = s.getFirstSelectedOption().getText();
		Reporter.log(text,true);
	}
	@Test
	public void allselected()
	{
		dropboxElement=driver.findElement(By.id("multiselect1"));
		s=new Select(dropboxElement);
		s.selectByIndex(0);
		s.selectByIndex(1);
		List<WebElement> all = s.getAllSelectedOptions();
		
		for (WebElement e : all) {
			Reporter.log(e.getText(),true);
		}
		}
		@Test
		public void wrapMethod()
		{
			dropboxElement=driver.findElement(By.id("multiselect1"));
			s=new Select(dropboxElement);
			WebElement wrapped = s.getWrappedElement();
			Reporter.log(wrapped.getText(),true);
		}
	
	
	
}
