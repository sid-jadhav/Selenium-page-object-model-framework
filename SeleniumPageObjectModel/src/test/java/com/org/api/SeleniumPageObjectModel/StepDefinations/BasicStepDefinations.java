package com.org.api.SeleniumPageObjectModel.StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class BasicStepDefinations {
	private By AlreadyRegistered_EmailAddress= By.xpath("//*[@id='email']");
	private By AlreadyRegistered_Password=By.xpath("//*[@id='passwd']");
	private By ForgotPassword = By.xpath("//*[@id='login_form']/div/p[1]/a");
	private By sign_in_button=By.xpath("//*[@id='SubmitLogin']/span");
	@When("^enter invalid credentials$")
	public void enter_invalid_credentials() throws Throwable {
		System.out.println(sign_in_button.toString());
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Sid2\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		WebElement sign_in= driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
		sign_in.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(AlreadyRegistered_EmailAddress).sendKeys("hghgfh@gmail.com");
		driver.findElement(AlreadyRegistered_Password).sendKeys("password");
		driver.findElement(sign_in_button).click();
	}

}
