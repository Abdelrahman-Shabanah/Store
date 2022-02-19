package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.AccountPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.SignInPage;

public class CreateNewUserTest extends TestBase{

	@DataProvider(name = "CreateUserData")
	public Object [][] CreateUserData() throws IOException {

		ExcelReader ER = new ExcelReader();
		return ER.RegisterationData();
	}
	HomePage homeObject;
	SignInPage SignInObject;
	CreateAccountPage CreateAccountObject;
	AccountPage AccountPageObject;

	@Test(dataProvider = "CreateUserData")
	public void CreateNewUser(String Mail, String FName, String LName, String Email, String Password, String AddFName, 
			String AddLName, String Company, String AddAddress,String AddCity,String PCode,
			String HPhone,String MPhone, String MyAddress) throws InterruptedException {

		homeObject = new HomePage(driver);
		homeObject.OpenSignInPage();

		SignInObject = new SignInPage(driver);
		SignInObject.EnterMail(Mail);

		Thread.sleep(2000);
		CreateAccountObject = new CreateAccountPage(driver);
		CreateAccountObject.RegisterNewUser(FName, LName, Email, Password, 
				AddFName, AddLName, Company, AddAddress, AddCity, PCode, HPhone, MPhone, MyAddress);

		Thread.sleep(2000);
		AccountPageObject = new AccountPage(driver);
		AccountPageObject.SignOutBTNCheck();



	}
}
