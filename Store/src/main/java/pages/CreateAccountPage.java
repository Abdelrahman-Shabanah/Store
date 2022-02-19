package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends PageBase{

	public CreateAccountPage(WebDriver driver){
		super(driver);
		
	}
	
	
	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	WebElement Title;
	
	@FindBy(xpath = "//*[@id=\"customer_firstname\"]")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='customer_lastname']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement Password;
	
	@FindBy(xpath = "//select[@id='days']")
	WebElement DOB_Day;
	
	@FindBy(xpath = "//select[@id='months']")
	WebElement DOB_Month;
	
	@FindBy(xpath = "//select[@id='years']")
	WebElement DOB_Year;
	
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement AddressFirstName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement AddressLastName;
	
	@FindBy(xpath = "//input[@id='company']")
	WebElement AddressCompany;
	
	@FindBy(xpath = "//input[@id='address1']")
	WebElement AddressAddress;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement AddressCity;
	
	@FindBy(xpath = "//select[@id='id_state']")
	WebElement State;
	
	@FindBy(xpath = "//input[@id='postcode']")
	WebElement AddressPostCode;
	
	@FindBy(xpath = "//select[@id='id_country']")
	WebElement AddressCountry;
	
	@FindBy(xpath = "//input[@id='phone']")
	WebElement Phone;
	
	@FindBy(xpath = "//input[@id='phone_mobile']")
	WebElement Mobile;
	
	@FindBy(xpath = "//input[@id='alias']")
	WebElement CusAddress;
	
	@FindBy(xpath = "//span[contains(.,'Register')]")
	WebElement RegisterBTN;
	
	
	public void RegisterNewUser(String FName, String LName, String Mail, String Pword, 
			String AddFName, String AddLName, String AddComapny, String Addressx, String AddCity, String AddPostCode, 
			 String Phonex, String Mobilex, String CusAdd) {
		
		Title.click();
		FirstName.sendKeys(FName);
		LastName.sendKeys(LName);
		Email.clear();
		Email.sendKeys(Mail);
		Password.sendKeys(Pword);
		DOB_Day.click();
		DOB_Day.sendKeys(Keys.ARROW_DOWN);
		DOB_Day.sendKeys(Keys.ARROW_DOWN);
		DOB_Day.sendKeys(Keys.ARROW_DOWN);
		DOB_Day.sendKeys(Keys.ENTER);
		DOB_Month.click();
		DOB_Month.sendKeys(Keys.ARROW_DOWN);
		DOB_Month.sendKeys(Keys.ARROW_DOWN);
		DOB_Month.sendKeys(Keys.ARROW_DOWN);
		DOB_Month.sendKeys(Keys.ENTER);
		DOB_Year.click();
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ARROW_DOWN);
		DOB_Year.sendKeys(Keys.ENTER);
		AddressFirstName.sendKeys(AddFName);
		AddressLastName.sendKeys(AddLName);
		AddressCompany.sendKeys(AddComapny);
		AddressAddress.sendKeys(Addressx);
		AddressCity.sendKeys(AddCity);
		State.click();
		State.sendKeys(Keys.ARROW_DOWN);
		State.sendKeys(Keys.ARROW_DOWN);
		State.sendKeys(Keys.ARROW_DOWN);
		State.sendKeys(Keys.ENTER);
		AddressPostCode.sendKeys(AddPostCode);
		AddressCountry.click();
		AddressCountry.sendKeys(Keys.ARROW_DOWN);
		AddressCountry.sendKeys(Keys.ENTER);
		Phone.sendKeys(Phonex);
		Mobile.sendKeys(Mobilex);
		CusAddress.sendKeys(CusAdd);
		RegisterBTN.click();
	}
	
	
}
