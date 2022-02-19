package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver;
	//Create constructor
	public PageBase(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
