package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BlousesCategoryPage extends PageBase{

	public BlousesCategoryPage(WebDriver driver){
		super(driver);
		
	}
	
	
	@FindBy(xpath = "//img[contains(@alt,'Blouse')]")
	WebElement BlouseImg;
	
	@FindBy(xpath = "//span[contains(.,'More')]")
	WebElement Blouse;
	
	public void ViewBlouse() throws InterruptedException {
		
		//Blouse.click();
		
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(BlouseImg).perform();
		Thread.sleep(1000);
		
		actions.moveToElement(Blouse);
		actions.click().build().perform();
		
		
	}

}
