package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {
	
	
	@Test (dataProvider="LoginData" , dataProviderClass=DataProviders.class) // getting dataprovider from diff class
	public void verify_loginDDT(String email,String pwd , String exp)
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
		
		lp.EmailWrite(email);
		
		logger.info("email we write");
		
		lp.PassWrite(pwd);
		
		logger.info("password we write");
		
		lp.LoginClick();
		
        MyAccountPage mp=new MyAccountPage(driver);
		
		logger.info("Account page we have");
		
		boolean targetPage = mp.isMyAccountPageExists();
		
		
		
		/*
		 * 
		 * 
		 */
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{
				
				mp.ClickLogout();
				
				Assert.assertTrue(true);
				
				
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetPage==true)
			{
				
				mp.ClickLogout();
				
				Assert.assertTrue(false);
				
				}
			else
				
			{
				Assert.assertTrue(true);
			}
		
		
		}
		
	}

}
