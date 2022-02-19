package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.AccountPage;
import pages.HomePage;
import pages.OpenSubCategoryPage;
import pages.SignInPage;

public class OpenSubCategoryTest extends TestBase{

	@DataProvider(name = "LoginData")
	public Object [][] LoginData() throws IOException {

		ExcelReader ER = new ExcelReader();
		return ER.LoginData();
	}
	
	HomePage homeObject;
	SignInPage SignInObject;
	AccountPage AccountPageObject;
	OpenSubCategoryPage OpenSubCategoryObject;


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
 

	}
}