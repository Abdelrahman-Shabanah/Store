package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.AccountPage;
import pages.HomePage;
import pages.SignInPage;

public class LoginTest extends TestBase{

	@DataProvider(name = "LoginData")
	public Object [][] LoginData() throws IOException {

		ExcelReader ER = new ExcelReader();
		return ER.LoginData();
	}
	
	HomePage homeObject;
	SignInPage SignInObject;
	AccountPage AccountPageObject;
	
	@Test(dataProvider = "LoginData")
	public void UserLogin(String Email, String Password) throws InterruptedException {
		homeObject = new HomePage(driver);
		homeObject.OpenSignInPage();
		
		Thread.sleep(5000);
		SignInObject = new SignInPage(driver);
		SignInObject.Login(Email, Password);
		
		Thread.sleep(5000);
		AccountPageObject = new AccountPage(driver);
		 AccountPageObject.SignOutBTNCheck();
	}
	
	
}
