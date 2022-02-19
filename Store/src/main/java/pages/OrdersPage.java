package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage  extends PageBase{

	public OrdersPage(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(xpath = "//h1[contains(.,'Order history')]")
	WebElement HistoryTXT;
	
	@FindBy(xpath = "(//td[contains(.,'Bank wire')])[1]")
	WebElement BankWire;
	
	
	public void ValidateBankWire() {
		
		assertEquals("ORDER HISTORY", HistoryTXT.getText());
		
		
		assertEquals("Bank wire", BankWire.getText());
		System.out.println("Order Placed Successfully...");
	}


}
