package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.AccountPage;
import pages.BlousePage;
import pages.BlousesCategoryPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.OpenSubCategoryPage;
import pages.SignInPage;

public class CheckoutTest extends TestBase{

	@DataProvider(name = "LoginData")
	public Object [][] LoginData() throws IOException {

		ExcelReader ER = new ExcelReader();
		return ER.LoginData();
	}
	
	HomePage homeObject;
	SignInPage SignInObject;
	AccountPage AccountPageObject;
	OpenSubCategoryPage OpenSubCategoryObject;
	BlousesCategoryPage BlouseObject;
	BlousePage BlousePageObject;
	CheckoutPage CheckoutObject;
	
	@Test(dataProvider = "LoginData")
	public void OpenBlousesPage(String Email, String Password) throws InterruptedException {
		homeObject = new HomePage(driver);
		homeObject.OpenSignInPage();

		SignInObject = new SignInPage(driver);
		SignInObject.Login(Email, Password);

		Thread.sleep(5000);
		AccountPageObject = new AccountPage(driver);
		AccountPageObject.SignOutBTNCheck();
		
		Thread.sleep(2000);
		OpenSubCategoryObject = new OpenSubCategoryPage(driver);
		OpenSubCategoryObject.OpenBlousesSubCategory();
 
		BlouseObject = new BlousesCategoryPage(driver);
		BlouseObject.ViewBlouse();
		
		Thread.sleep(500);
		BlousePageObject = new BlousePage(driver);
		BlousePageObject.CheckBlouseName();
		
		CheckoutObject = new CheckoutPage(driver);
		CheckoutObject.Proceed();
		
	}
	
	

}
