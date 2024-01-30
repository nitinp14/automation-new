package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GetOptionsMethod extends OmayoBaseClass {
	private Select s;
	private WebElement dropdown;
	
	@Test
	public void optionList()
	{
		dropdown=driver.findElement(By.id("drop1"));
		
		s=new Select(dropdown);
		List<WebElement> allOptions = s.getOptions();
		for (WebElement e : allOptions) {
			Reporter.log(e.getText());
		}
	}
}
