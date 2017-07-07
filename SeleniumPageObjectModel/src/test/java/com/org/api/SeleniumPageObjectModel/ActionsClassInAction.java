package com.org.api.SeleniumPageObjectModel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassInAction {
	WebDriver driver;
	By Scetch=By.xpath("//*[@id='drag1']");
	By target=By.xpath("//*[@id='div1']");
	//By pencil=By.xpath("//*[@id='aww-toolbar-window']/div/div[3]/div[1]/svg/path");
	@Test
	public void MouseHover() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Sid2\\chromedriver.exe");
		driver= new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("file:///D:/draganddrop.html");
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='alertify']/div/p")));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//act.dragAndDrop(driver.findElement(Scetch), driver.findElement(target)).build().perform();;
		Action drag=act.clickAndHold(driver.findElement(Scetch)).moveToElement(driver.findElement(target)).release().build();
		drag.perform();
	}
}