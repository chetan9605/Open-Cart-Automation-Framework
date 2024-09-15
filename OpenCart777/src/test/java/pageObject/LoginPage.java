package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="input-email")
	WebElement EmailWrite;
	
	public void EmailWrite(String user)
	{
		EmailWrite.sendKeys(user);
	}

	
	
	@FindBy(id="input-password")
	WebElement PassWrite;
	
	public void PassWrite(String pwd)
	{
		PassWrite.sendKeys(pwd);
	}
	
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement LoginClick;
	
	public void LoginClick()
	{
		LoginClick.click();
	}

}
