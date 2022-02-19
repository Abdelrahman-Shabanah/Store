package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public WebDriver driver;
	
	@BeforeSuite
	public void StartDriver() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}
	
	
	  @AfterSuite 
	  public void CloseDriver() { driver.quit();
	  
	  }
	 
}
