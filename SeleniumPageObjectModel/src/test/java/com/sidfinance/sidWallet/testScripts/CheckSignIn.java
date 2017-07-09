package com.sidfinance.sidWallet.testScripts;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sidfinance.sidWallet.pageLibrary.createAccount;
import com.sidfinance.sidWallet.pageLibrary.signIn;

public class CheckSignIn {
	//static Logger log= Logger.getLogger(CheckSignIn.class.getName());
	WebDriver driver;
	@Before
	public void init(){
		//log.info("Initializing the driver to fire fox");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Sid2\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	//@After
	public void tearDown(){
		//log.info("Closing the browser");
		driver.close();
	}
	
	//@Test
	public void CheckSignInFunctionality(){
		//log.info("Checking the SignIn Page");
		signIn si=new signIn(driver);
		si.Enter_AlreadyRegistered_EmailAddress("sidisking@gmail.com");
		si.Enter_AlreadyRegistered_Password("Shetta");
		si.ClickOnSignIn();
	}
	@Test
	public void CheckCreateAccountPage() throws InterruptedException
	{
		signIn si=new signIn(driver);
		si.Enter_CreateAnAccount_EmailAddress("SiddheshJadhav@gmail.com");
		createAccount ca;
		ca=si.ClickOnCreateAnAccount();
		Thread.sleep(3000);
		ca.ClickOnRadioButton("Mr");
		ca.Enter_FirstName("Siddhesh");
		ca.Enter_LastName("Jadhav");
		ca.Enter_Password("sid123");
		ca.Select_Day(6);
		ca.Select_Month("June");
		ca.Select_Year("1994");
	}
}
