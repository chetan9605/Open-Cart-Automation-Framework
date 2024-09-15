package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage {
	
	
WebDriver driver;
	
      public  AccountRegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
      
      @FindBy(id="input-firstname")
  	WebElement firstName;
  	
  	public void FirstName(String fname)
  	{
  		firstName.sendKeys(fname);
  	}
  	
  	 @FindBy(id="input-lastname")
   	WebElement lastName;
   	
   	public void LastName(String lname)
   	{
   		lastName.sendKeys(lname);
   	}

   	
    @FindBy(id="input-email")
   	WebElement email;
   	
   	public void Email(String mail)
   	{
   		email.sendKeys(mail);
   	}
   	
   	
    @FindBy(id="input-telephone")
   	WebElement telephone;
   	
   	public void Telephone(String phone)
   	{
   		telephone.sendKeys(phone);
   	}
   	
    @FindBy(id="input-password")
   	WebElement passw;
   	
   	public void Password(String pwd)
   	{
   		passw.sendKeys(pwd);
   	}
   	
   	
    @FindBy(id="input-confirm")
   	WebElement confirmPass;
   	
   	public void ConfirmPassword(String cpwd)
   	{
   		confirmPass.sendKeys(cpwd);
   	}
   	
   	
    @FindBy(name="agree")
   	WebElement chkbox;
   	
   	public void CheckBox()
   	{
   		chkbox.click();
   	}
   	
    @FindBy(xpath="//input[@class='btn btn-primary']")
   	WebElement contue;
   	
   	public void btnContinue()
   	{     
   		//sol1
   		contue.click();
   		
  /* 		//sol2
   		contue.submit();
   		
   		//sol3
   		Actions a=new Actions(driver);
   		a.moveToElement(contue).click().perform();
   		
   		//sol4
   		JavascriptExecutor js=(JavascriptExecutor) driver;
   		js.executeScript("arguments[0].click();",contue);
   		
   		//sol5
   		contue.sendKeys(Keys.ENTER);
   		
   		//sol6
   		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
   		wait.until(ExpectedConditions.elementToBeClickable(contue)).click();
   		
   		                                         */
   		
   		
   		
   		
   	}
}
