package sample_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {
	
public void verifySwagLabsLogin()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	WebElement usernamefield=driver.findElement(By.id("user-name"));
	usernamefield.sendKeys("standard_user");
	WebElement passwordfield=driver.findElement(By.id("password"));
	passwordfield.sendKeys("secret_sauce");
	WebElement loginbutt=driver.findElement(By.id("login-button"));
	loginbutt.click();
	driver.close();	
}

public void verifyDemoWebshopLogin()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement loginmenu=driver.findElement(By.className("ico-login"));
	loginmenu.click();
	WebElement emailidfield=driver.findElement(By.id("Email"));
	emailidfield.sendKeys("noorajahangeer1996@gmail.com");
	WebElement passwordfield=driver.findElement(By.id("Password"));
	passwordfield.sendKeys("noora1996");
	WebElement loginButton=driver.findElement(By.className("login-button"));
	loginButton.click();
	//driver.close();                   //close current web page
	driver.quit();                          //closing multiple web pages at a time
}

public void verifyDemoWebshopLoginXpath()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement loginmenu=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	loginmenu.click();
	WebElement emailidfield=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
	emailidfield.sendKeys("noorajahangeer1996@gmail.com");
	WebElement passwordfield=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
	passwordfield.sendKeys("noora1996");
	WebElement loginButton=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
	loginButton.click();
	driver.close();	
}

public void verifyDemoWebshopLoginCssSelector()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement loginmenu=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
	loginmenu.click();
	WebElement emailidfield=driver.findElement(By.cssSelector("#Email"));
	emailidfield.sendKeys("noorajahangeer1996@gmail.com");
	WebElement passwordfield=driver.findElement(By.cssSelector("#Password"));
	passwordfield.sendKeys("noora1996");
	WebElement loginButton=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
	loginButton.click();
	driver.close();	
}

	public void verifyDemo2Registration()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement registerMenu=driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(2) > a"));
		registerMenu.click();
		WebElement firstName=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		firstName.sendKeys("AYAAN");
		WebElement lastName=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
		lastName.sendKeys("MOHD");
		WebElement mobNum=driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > input"));
		mobNum.sendKeys("1234567890");
		WebElement eMail=driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		eMail.sendKeys("ayaan@gmail.com");
		WebElement houseName=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
		houseName.sendKeys("AYAAN VILLA");
		WebElement city=driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(8) > td:nth-child(2) > input"));
		city.sendKeys("TRIVANDRUM");
		WebElement state=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
		state.sendKeys("KERALA");
		WebElement pCode=driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(10) > td:nth-child(2) > input"));
		pCode.sendKeys("695005");
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("ayaan@gmail.com");
		WebElement password=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
		password.sendKeys("ayaan2018");
		WebElement confirmPassword=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
		confirmPassword.sendKeys("ayaan2018");
		WebElement submitButton=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
		submitButton.click();
		driver.close();
	}
	
	public void verifyLinkText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement destination=driver.findElement(By.linkText("your destination"));
		destination.click();
		driver.close();	
	}
	
	public void verifyPartialLinkText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement destination=driver.findElement(By.partialLinkText("destination"));
		destination.click();
		driver.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commands obj=new Commands();
		//obj.verifySwagLabsLogin();
		//obj.verifyDemoWebshopLogin();
		//obj.verifyLinkText();
		//obj.verifyPartialLinkText();
		obj.verifyDemo2Registration();
		//obj.verifyDemoWebshopLoginXpath();
		//obj.verifyDemoWebshopLoginCssSelector();
		
	}

}
