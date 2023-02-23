package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountPIN;
import pageObjects.HomePage;
import pageObjects.Login;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC_001_Login extends BaseClass{
	
	@Test(groups = {"Sanity", "Master"})
	public void test_login()
	{
		logger.info("*****The test case TC_001_Login********");
		logger.debug("Application logs***");
		try
		{
		HomePage hp = new HomePage(driver);
		
		hp.login_Click();
		logger.info("*****Clicked on login link of HomePage********");
		
		Login log = new Login(driver);
		log.setEmail(rb.getString("email"));
		logger.info("*****Entetered correct email ********");
		log.setPassword(rb.getString("password"));
		logger.info("*****Entered correct password********");
		log.clickSubmitBtn();
		
		logger.info("*****clicked on submit button********");
		
		AccountPIN pin = new AccountPIN(driver);
		pin.enterPIN("8989");
		pin.clickSubmitPIN();
		
		
		String confirmMessage = log.getConfirmationMessageOfLogin();
		Assert.assertEquals(confirmMessage, "Welcome to OpenCart!");
		
		MyAccount logout = new MyAccount(driver);
		logout.logOut();
		
		}
		catch (Exception e) {
			Assert.fail();
		}
		}

}
