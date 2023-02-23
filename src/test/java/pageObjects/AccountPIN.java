package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class AccountPIN extends BasePage {

	public AccountPIN(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name = "pin")
	WebElement SignInPIN;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg']")
	WebElement SignInPINBtn;
	
	public void enterPIN(String pinno)
	{
		SignInPIN.sendKeys(pinno);
	}
	
	public void clickSubmitPIN()
	{
		SignInPINBtn.click();
	}


}
