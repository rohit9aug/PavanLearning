package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class Login extends BasePage{

	public Login(WebDriver driver) {
		super(driver);
		
		
		
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement loginEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement loginPassword;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg hidden-xs']")
	WebElement loginSubmit;
	
	@FindBy(xpath = "//p[normalize-space()='Welcome to OpenCart!']")
	WebElement confirmationMessageOFLogin;
	
	public void setEmail(String email) {
		loginEmail.sendKeys(email);
	}
	
	public void setPassword(String pass) {
		loginPassword.sendKeys(pass);
	}
	
	public void clickSubmitBtn() {
		loginSubmit.click();
	}
	
	public String getConfirmationMessageOfLogin()
	{
		return confirmationMessageOFLogin.getText();
	}
	

	

	
}
