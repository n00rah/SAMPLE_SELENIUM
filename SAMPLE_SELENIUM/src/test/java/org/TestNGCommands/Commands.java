package org.TestNGCommands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends BrowserLaunch {
@Test

	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualtitle=driver.getTitle();
		System.out.println("WEB PAGE TITLE :"+actualtitle);
		String expectedTitle="Demo Web Shop";
		Assert.assertEquals(actualtitle,expectedTitle,"TITLE MISMATCH");
		
		
	}
@Test

public void verifyDemoWebShopLogin()
{
	driver.get("https://demowebshop.tricentis.com/");
	WebElement loginMenu=driver.findElement(By.xpath("//a[text()='Log in']"));
	loginMenu.click();
	
	WebElement emailField=driver.findElement(By.xpath("//input[@id='Email']"));
	emailField.sendKeys("noorajahangeer1996@gmail.com");
	//String expected=emailField.getText();
	String expected="noorajahangeer@gmail.com";             //false
	//String expected="noorajahangeer1996@gmail.com";      //true
	
	WebElement passwordField=driver.findElement(By.xpath("//input[@id='Password']"));
	passwordField.sendKeys("noora1996");
	
	WebElement loginButton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginButton.click();
	
	WebElement mailId=driver.findElement(By.xpath("//a[text()='noorajahangeer1996@gmail.com']"));
	String actual=mailId.getText();
	
	Assert.assertEquals(actual,expected,"MISMATCH");
	
}

@Test

public void verifySwagLabsLogin()
{
	driver.get("https://www.saucedemo.com/");
	
	WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
	userName.sendKeys("standard_user");
	
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	
	WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
	loginButton.click();
	
	WebElement heading=driver.findElement(By.xpath("//div[@class='app_logo']"));
	String expected=heading.getText();
	
	//String actual="Swag Lab";    //false
	String actual="Swag Labs";     //true
	
	Assert.assertEquals(actual,expected,"HEADING MISMATCH");
	
}
@Test

public void verifyDemoWebShopRegisterIsSelected()
{
	boolean status;
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement registerMenu=driver.findElement(By.xpath("//a[@class='ico-register']"));
	registerMenu.click();
	
	WebElement genderMale=driver.findElement(By.xpath("//input[@id='gender-male']"));
	
	status=genderMale.isSelected();
	Assert.assertFalse(status,"GENDER FIELD SELECTED");
	
	genderMale.click();
	status=genderMale.isSelected();
	Assert.assertTrue(status, "GENDER FIELD NOT SELECTED");
}

@Test
public void verifyDemoWebShopRegisterIsEnabled()
{
	boolean status;
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement registerMenu=driver.findElement(By.xpath("//a[@class='ico-register']"));
	registerMenu.click();
	
	WebElement genderMale=driver.findElement(By.xpath("//input[@id='gender-male']"));
	status=genderMale.isEnabled();
	Assert.assertFalse(status,"GENDER FIELD ENABLED");
}

@Test

public void verifyDemoWebShopRegisterIsDisplayed()
{
	boolean status;
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement registerMenu=driver.findElement(By.xpath("//a[@class='ico-register']"));
	registerMenu.click();
	
	WebElement genderMale=driver.findElement(By.xpath("//input[@id='gender-male']"));
	status=genderMale.isDisplayed();
	Assert.assertTrue(status,"GENDER FIELD NOT DISPLAYED");
}


@Test

public void verifyJavaScriptExecutorSendkeysAndClick()
{
	
	driver.get("https://demowebshop.tricentis.com/");	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById(\"newsletter-email\").value='test@test.com'");
	js.executeAsyncScript("document.getElementById(\"newsletter-subscribe-button\").click()");
	
}

@Test

public void verifyVerticalScroll()
{

	driver.get("https://demowebshop.tricentis.com/");	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
}

@Test


public void verifyKeyboardEvents() throws AWTException
{
	driver.get("https://demowebshop.tricentis.com/");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_T);
	
}

@Test

public void verifyDemoWebshopLoginJavaScripExecutor()
{
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement loginMenu=driver.findElement(By.xpath("//a[@class='ico-login']"));
	loginMenu.click();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById(\"Email\").value='noora@gmail.com'");
	js.executeScript("document.getElementById(\"Password\").value='noora1996'");
	
	WebElement loginButton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginButton.click();
	
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
	
}

@Test

public void verifyAlertScroll()
{
	driver.get("https://demoqa.com/alerts");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,100)");
	js.executeScript("document.getElementById(\"alertButton\").click()");
	
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	js.executeScript("document.getElementById(\"confirmButton\").click()");
	alert.dismiss();
	
	WebElement alertMessageField=driver.findElement(By.xpath("//span[@id='confirmResult']"));
	String alertStatus=alertMessageField.getText();
	System.out.println(alertStatus);

}





}
            