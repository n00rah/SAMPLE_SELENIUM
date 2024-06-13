package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class RegisterPageTest extends Base
{
	
	@Test
	
	public void verifyRegisterPageTitle() 
	{
		driver.get("https://demowebshop.tricentis.com/register");
		 String actualtitle=driver.getTitle();
			System.out.println("WEB PAGE TITLE :"+actualtitle);
			String expectedTitle=ExcelUtility.getStringData(0,0,"RegisterPage");
			System.out.println("expectedTitle"+expectedTitle);
			Assert.assertEquals(actualtitle,expectedTitle,"REGISTER PAGE TITLE MISMATCH"); 
			
		}
	
@Test

public void verifyUserRegistration() 
{
	driver.get("https://demowebshop.tricentis.com/register");
	String firstName=RandomDataUtility.getFirstName();
	String lastName=RandomDataUtility.getLastName();
	String eMailId=firstName+"."+lastName+"@yahoo.com";
	String password=firstName+"."+lastName;
	WebElement gender=driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
	gender.click();
	
	WebElement first_Name=driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
	first_Name.sendKeys(firstName);
	
	WebElement last_Name=driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
	last_Name.sendKeys(lastName);
	
	WebElement eMail=driver.findElement(By.xpath("//input[@id=\"Email\"]"));
	eMail.sendKeys(eMailId);
	
	WebElement pass_word=driver.findElement(By.xpath("//input[@id=\"Password\"]"));
	pass_word.sendKeys(password);
	
	WebElement confirmPassword=driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
	confirmPassword.sendKeys(password);
	
	WebElement registerButton=driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
	registerButton.click();
	WebElement registrationStatus=driver.findElement(By.xpath("//div[@class=\"result\"]"));
	String actualText=registrationStatus.getText();
	String expectedText=ExcelUtility.getStringData(0,5,"RegisterPage");
	Assert.assertEquals(actualText,expectedText,"STATUS MISMATCH");	
	 
	
}
	}
	
	


