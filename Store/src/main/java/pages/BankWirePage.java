package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankWirePage extends PageBase{

	public BankWirePage(WebDriver driver){
		super(driver);
		
	}

	@FindBy(xpath = "//a[@class='bankwire']")
	WebElement BankWireSel;
	
	@FindBy(xpath = "//span[contains(.,'I confirm my order')]")
	WebElement ConfirmBTN;
	
	@FindBy(xpath = "//strong[contains(.,'Your order on My Store is complete.')]")
	WebElement SuccessMSG;
	
	@FindBy(xpath = "//a[@title='Back to orders']")
	WebElement BackToOrdersBTN;
	
	public void ConfirmWithBankWire() throws InterruptedException {
		
		BankWireSel.click();
		ConfirmBTN.click();
		Thread.sleep(1000);
		assertTrue(SuccessMSG.getText().contains("Your order on My Store is complete"));
		
	}
	
	public void BackToOrder() {
		
		BackToOrdersBTN.click();
		
		
	}
	
}
