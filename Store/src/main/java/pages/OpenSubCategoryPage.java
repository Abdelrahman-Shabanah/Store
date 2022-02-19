package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OpenSubCategoryPage extends PageBase{

	public OpenSubCategoryPage(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[@title='Women']")
	WebElement WomenCateogy;
	
	@FindBy(xpath = "//a[@title='Blouses']")
	WebElement BlousesSubCategory;
	
	@FindBy(xpath = "//span[@class='category-name'][contains(.,'Blouses')]")
	WebElement Blouse;
	
	
	public void OpenBlousesSubCategory() throws InterruptedException {
		
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(WomenCateogy).perform();
		Thread.sleep(1000);
		
		actions.moveToElement(BlousesSubCategory);
		actions.click().build().perform();
		Thread.sleep(1000);
		System.out.println(Blouse.getText());
		assertEquals("Blouses", Blouse.getText());
		
	}
	
}
