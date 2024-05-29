package org.TestNGCommands;

import org.openqa.selenium.By;
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








}
            