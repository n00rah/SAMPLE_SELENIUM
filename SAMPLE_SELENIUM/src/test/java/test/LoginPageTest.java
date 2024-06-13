package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import dataprovider.DataProviders;
import listeners.RetryAnalyser;
import utilities.ExcelUtility;

public class LoginPageTest extends Base
{
@Test(retryAnalyzer=RetryAnalyser.class)

	public void verifyLoginPageTitleUsingRetry()
	{
	driver.get("https://demowebshop.tricentis.com/login");
	    String actualtitle=driver.getTitle();
		System.out.println("WEB PAGE TITLE :"+actualtitle);
		String expectedTitle="Demo Web Shop. Logi";     //Demo Web Shop. Login
		Assert.assertEquals(actualtitle,expectedTitle,"LOGIN PAGE TITLE MISMATCH"); 
	}
@Test(priority=1)//used to set priority for a test case
public void verifyLoginPageTitle()
{
driver.get("https://demowebshop.tricentis.com/login");
    String actualtitle=driver.getTitle();
	System.out.println("WEB PAGE TITLE :"+actualtitle);
	String expectedTitle="Demo Web Shop. Login";     //Demo Web Shop. Login
	Assert.assertEquals(actualtitle,expectedTitle,"LOGIN PAGE TITLE MISMATCH"); 
}
@Test

public void verifyUserLogin()
{
	driver.get("https://demowebshop.tricentis.com/login");
	
	WebElement emailField=driver.findElement(By.xpath("//input[@id='Email']"));
	emailField.sendKeys(ExcelUtility.getStringData(0,1,"LoginPage"));
	
	String expected=ExcelUtility.getStringData(0,1,"LoginPage");      //true
	
	WebElement passwordField=driver.findElement(By.xpath("//input[@id='Password']"));
	passwordField.sendKeys(ExcelUtility.getStringData(0,2,"LoginPage"));
	
	WebElement loginButton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginButton.click();
	
	WebElement mailId=driver.findElement(By.xpath("//a[text()='noorajahangeer1996@gmail.com']"));
	String actual=mailId.getText();
	
	Assert.assertEquals(actual,expected,"MISMATCH");
	

}
@Test(dataProvider="InvalidUserCredentials",dataProviderClass=DataProviders.class,retryAnalyzer=RetryAnalyser.class)  //retry execute 9 times

public void verifyUserLoginWithInvalidCredentials(String username,String password)
{
	driver.get("https://demowebshop.tricentis.com/login");
	
	WebElement emailField=driver.findElement(By.xpath("//input[@id='Email']"));
	emailField.sendKeys(username);
	
	WebElement passwordField=driver.findElement(By.xpath("//input[@id='Password']"));
	passwordField.sendKeys(password);
	
	WebElement loginButton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginButton.click();
	WebElement textField=driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
	String actualErrorMsg=textField.getText();
	String expectedErrorMsg=ExcelUtility.getStringData(0, 3,"LoginPag");
	Assert.assertEquals(actualErrorMsg,expectedErrorMsg,"LOGIN SUCCESSFULL");
}


}
