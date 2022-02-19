package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageBase{

	public SignInPage(WebDriver driver){
		super(driver);

	}

	@FindBy(xpath = "//input[@id='email_create']")
	WebElement EmailBox;

	@FindBy(xpath = "//span[contains(.,'Create an account')]")
	WebElement CreateAccountBTN;

	@FindBy(xpath = "//input[@id='email']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElement Password;

	@FindBy(xpath = "//span[contains(.,'Sign in')]")
	WebElement SignInBTN;

	public void EnterMail(String Mail) {

		EmailBox.sendKeys(Mail);
		CreateAccountBTN.click();
	}

	public void Login(String Emailx, String Passwordx) {

		Email.sendKeys(Emailx);
		Password.sendKeys(Passwordx);
		SignInBTN.click();
	}


}
