package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccCreated {
	
WebDriver driver;
	
        public AccCreated(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement AccCreatedMesg;
	
	
	public String getConfirmMesg()
	{
		try {
			
			return (AccCreatedMesg.getText());
			
		} catch (Exception e) {
			
			return (e.getMessage());
			
		}
	}

}
