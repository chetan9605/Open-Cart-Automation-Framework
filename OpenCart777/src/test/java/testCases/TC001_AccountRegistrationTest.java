package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.AccCreated;
import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	
	
	
	
	@Test
	public void verify_account_registration()
	{
		
		logger.info("Test case started");
		
		HomePage hp=new HomePage(driver);
		
		logger.info("url opened");
		
		hp.ClickOnMyAccount();
		
		logger.info("click on my account");
		
		
		hp.ClickOnRegister();
		logger.info("click on Register");
		
		AccountRegistrationPage ar=new AccountRegistrationPage(driver);
		
		logger.info("Register page we have");
		
		ar.FirstName(randomeString().toUpperCase());
		
		logger.info("write first name");
		
		ar.LastName(randomeString().toUpperCase());
		
		logger.info("last name");
		
		ar.Email(randomeString()+"@gmail.com");
		
		logger.info("gmail we write");
		
		ar.Telephone(randomeNumber());
		
		logger.info("mobile number");
		
		//
		String password = randomeAlphaNumeric();
		
		ar.Password(password);
		
		logger.info("password");
		
		ar.ConfirmPassword(password);
		
		logger.info("Confirm password");
		
		ar.CheckBox();
		
		logger.info("click check box");
		
		ar.btnContinue();
		
		logger.info("click on Continue");
		
		
		AccCreated ac=new AccCreated(driver);
		
		logger.info("Account created page");
		
		String ConfirmMesg = ac.getConfirmMesg();
		
		logger.info("get message");
		
		Assert.assertEquals(ConfirmMesg,"Your Account Has Been Created!");
		
		logger.info("message we getting");
	}
	
	
}
