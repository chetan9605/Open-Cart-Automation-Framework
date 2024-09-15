package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement Myaccount;
	
	public void ClickOnMyAccount()
	{
		Myaccount.click();
	}
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	public void ClickOnRegister()
	{
		register.click();
	}
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	
	public void clickLogin()
	{
		login.click();
	}
	
	
	

}
