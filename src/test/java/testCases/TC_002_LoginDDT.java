package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountPIN;
import pageObjects.HomePage;
import pageObjects.Login;
import pageObjects.MyAccount;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_002_LoginDDT extends BaseClass{
	
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = {"Regression", "Master"})
	public void test_loginDDT(String email, String password, String exp)
	{
		try {
			HomePage hp = new HomePage(driver);
			
		hp.login_Click();
		Login log = new Login(driver);
		
		log.setEmail(email);
		
		log.setPassword(password);
		
		log.clickSubmitBtn();
		
		
		AccountPIN pin = new AccountPIN(driver);
		pin.enterPIN("8989");
		pin.clickSubmitPIN();
		
		String confirmMessage = log.getConfirmationMessageOfLogin();
		//Assert.assertEquals(confirmMessage, "Welcome to OpenCart1!");
		
		MyAccount logout = new MyAccount(driver);
		
		
		if(exp.equals("Valid"))
		{
			if(confirmMessage=="Welcome to OpenCart!")
			{
				logout.logOut();
				Assert.assertTrue(true);
			}
			
		}
			
			
		
		if(exp.equals("Invalid"))
		{
			if(confirmMessage=="Welcome to OpenCart!")
			{
				logout.logOut();
				Assert.assertTrue(false);
			}
			else
			{
			
			Assert.assertTrue(true);
			}
		
		}
		}
		catch (Exception e) {
			Assert.fail();
		}
		
	}
	}


