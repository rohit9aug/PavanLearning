package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class MyAccount extends BasePage {
	

		public MyAccount(WebDriver driver) {
			super(driver);
			
			
			
		}
		
		@FindBy(xpath = "//a[@class='btn btn-black navbar-btn']")
		WebElement logOut;
		
		public void logOut()
		{
			logOut.click();
		}

}
