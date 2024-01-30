package practiceDDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMHomepageImplementationClass {
	
	@FindBy(id="container_tasks")
	private WebElement taskButton;
	
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement dropdown;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustButton;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custNAme;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement desc;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCust;
	
	@FindBy(xpath="(//div[text()='Big Bang Company'])[4]")
	private WebElement bigbang;
	
	@FindBy(xpath ="//div[text()='Create Customer']")
	private WebElement createCust;
	
	public POMHomepageImplementationClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setHomepage(String cn,String dc)
	{
		taskButton.click();
		dropdown.click();
		newCustButton.click();
		custNAme.sendKeys(cn);
		desc.sendKeys(dc);
		selectCust.click();
		bigbang.click();
		createCust.click();
		
	}
	
}
