package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Elements


	@FindBy(xpath = "//a[@class='btn btn-link navbar-btn']")
	WebElement loginBtn;
	
	
	
	public void login_Click()
	{
		loginBtn.click();
	}

}
