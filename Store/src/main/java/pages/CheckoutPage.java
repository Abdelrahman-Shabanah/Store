package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase{

	public CheckoutPage(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(xpath = "(//span[contains(.,'Proceed to checkout')])[2]")
	WebElement ProceedBTN;
	
	@FindBy(xpath = "//input[@id='cgv']")
	WebElement Agree;
	
	public void Proceed() throws InterruptedException {
		
		ProceedBTN.click();
		Thread.sleep(500);
		ProceedBTN.click();
		Thread.sleep(500);
		Agree.click();
		ProceedBTN.click();
		
	}
	
	
}
