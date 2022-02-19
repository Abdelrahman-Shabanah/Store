package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageBase{

	public AccountPage(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement SignOutBTN;
	
	public void SignOutBTNCheck() {
		
		System.out.println(SignOutBTN.getText());
		assertEquals("Sign out", SignOutBTN.getText());
		System.out.println("User Logged in Successfully");
		//SignOutBTN.click();
	}
}
