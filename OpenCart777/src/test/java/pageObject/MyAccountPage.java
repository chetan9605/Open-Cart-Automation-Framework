package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	
WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement AccountMy;
	
	public boolean isMyAccountPageExists()
	{
		try {
			
			return (AccountMy.isDisplayed());
			
		} catch (Exception e) {
			
			return false;
		}
		
	}
	
	@FindBy(xpath="//a[@class='list-group-item' and text()='Logout' ]")
	WebElement logout;
	
	public void ClickLogout()
	{
		logout.click();
	}
	

}
