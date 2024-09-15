package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest  extends BaseClass {
	
	
	@Test
	public void verify_Login()
	{
		
		logger.info("Login Test case started");
		
		HomePage hp=new HomePage(driver);
		
		logger.info("Home page");
		
		hp.ClickOnMyAccount();
		
		logger.info("click on my account");
		
		hp.clickLogin();
		
		logger.info("click on login");
		
		LoginPage lp=new LoginPage(driver);
		
		logger.info("Login page we have");
		
		lp.EmailWrite(p.getProperty("email"));
		
		logger.info("email we write");
		
		lp.PassWrite(p.getProperty("password"));
		
		logger.info("password we write");
		
		lp.LoginClick();
		
		logger.info("click on login");
		
		MyAccountPage mp=new MyAccountPage(driver);
		
		logger.info("Account page we have");
		
		boolean targetPage = mp.isMyAccountPageExists();
		
		logger.info("verify account page");
		
		Assert.assertEquals(targetPage, true,"Login Failed");
		
		logger.info("verify success");
		
		//Assert.assertTrue(targetPage);
	}

}
