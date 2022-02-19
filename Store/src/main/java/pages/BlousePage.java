package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlousePage extends PageBase{

	public BlousePage(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(xpath = "//h1[@itemprop='name']")
	WebElement BlouseName;
	
	@FindBy(xpath = "//span[contains(.,'Add to cart')]")
	WebElement AddToCartBTN;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement ProceedBTN;
	
	
	public void CheckBlouseName() throws InterruptedException {
		
		assertEquals("Blouse", BlouseName.getText());
		AddToCartBTN.click();
		Thread.sleep(2000);
		ProceedBTN.click();
		
	}

}
