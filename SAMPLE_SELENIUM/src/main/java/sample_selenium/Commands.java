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
	public void relativeXpath()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//WebElement registerMenu=driver.findElement(By.xpath("//a[@class='ico-register']"));                                       //using tag, attribute and value
		//WebElement registerMenu=driver.findElement(By.xpath("//a[@class='ico-register' and text()='Register']"));                 //using and
		//WebElement registerMenu=driver.findElement(By.xpath("//a[@class='ico-register' or text()='Register']"));                  //using or
		//WebElement registerMenu=driver.findElement(By.xpath("//div[@class='header-links']//a[@class='ico-register']"));           //from parent to child
		//WebElement registerMenu=driver.findElement(By.xpath("//a[@class='ico-register']//parent::li"));                             //using parent
		//WebElement registerMenu=driver.findElement(By.xpath("//a[text()='Register']"));                                           //using text()
		//WebElement registerMenu=driver.findElement(By.xpath("//a[contains(@class,'ico-register')]"));                              //using contains()
		WebElement registerMenu=driver.findElement(By.xpath("//a[starts-with(@class,'ico-reg')]"));                                  //using starts-with()
		registerMenu.click();   
		
		
		//WebElement gender=driver.findElement(By.xpath("//input[@id='gender-female']"));                                                    //using tag,attribute and value
		//WebElement gender=driver.findElement(By.xpath("//input[@name='Gender' and @value='F']"));                                          //using and
		//WebElement gender=driver.findElement(By.xpath("//input[@id='gender-female' or name='Gender']"));                                  //using or
		//WebElement gender=driver.findElement(By.xpath("//div[@class='gender']//input[@id='gender-female']"));                              //from parent to child
		//WebElement gender=driver.findElement(By.xpath("//input[@value='F']//parent::div"));                                                //using parent
		//WebElement gender=driver.findElement(By.xpath("//div[@class='gender']//input[@id='gender-male']//following-sibling::label"));      //using sibling
		//WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));                                                        //using text()
		//WebElement gender=driver.findElement(By.xpath("//input[contains(@id,'gender-female')]"));                                         //using contains()
		WebElement gender=driver.findElement(By.xpath("//input[starts-with(@id,'gender-fe')]"));                                            //using starts-with()
		gender.click();    
		
		
		//WebElement firstName=driver.findElement(By.xpath("//input[@name='FirstName']"));                                                                    //using tag, attribute and value
		//WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName'  and @class='text-box single-line']"));                                     //using and
		//WebElement firstName=driver.findElement(By.xpath("//input[@data-val='true' or data-val-required='First name is required.' or name='FirstName']"));  //using or
		//WebElement firstName=driver.findElement(By.xpath("//div[@class='inputs']//input[@id='FirstName']"));                                                 //from parent to child
		//WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName']//parent::div"));                                                            //using parent
		//WebElement firstName=driver.findElement(By.xpath("//div[@class='inputs']//label[@for='FirstName']//following-sibling::input"));                         //using sibling
		//WebElement firstName=driver.findElement(By.xpath("//label[text()='First name:']"));                                                                        //using text()
		//WebElement firstName=driver.findElement(By.xpath("//input[contains(@id,'FirstName')]"));                                                            //using contains()
		WebElement firstName=driver.findElement(By.xpath("//input[starts-with(@name,'First')]"));                                                           //using starts-with()
		firstName.sendKeys("NOORA");          
	   
	    
	   //WebElement lastName=driver.findElement(By.xpath("//input[@id='LastName']"));                               //using tag, attribute and value
	   //WebElement lastName=driver.findElement(By.xpath("//input[@id='LastName' and @name='LastName']"));           //using and
	   //WebElement lastName=driver.findElement(By.xpath("//input[@id='LastName' or @name='LastName']"));              //using or
	   //WebElement lastName=driver.findElement(By.xpath("//div[@class='inputs']//input[@id='LastName']"));            //from parent to child
	   //WebElement lastName=driver.findElement(By.xpath("//input[@name='LastName']//parent::div"));                    //using parent
	   //WebElement lastName=driver.findElement(By.xpath("//div[@class='inputs']//label[@for='LastName']//following-sibling::input"));   //using sibling                                                        //using sibling
	   //WebElement lastName=driver.findElement(By.xpath("//label[text()='Last name:']"));                             //using text()
	   //WebElement lastName=driver.findElement(By.xpath("//input[contains(@name,'LastName')]"));                      //using contains()
	   WebElement lastName=driver.findElement(By.xpath("//input[starts-with(@name,'Last')]"));                         //using starts-with()
	   lastName.sendKeys("J");  
	    
	    
	    
	   //WebElement eMail=driver.findElement(By.xpath("//input[@name='Email']"));                                                      //using tag, attribute and value
	   //WebElement eMail=driver.findElement(By.xpath("//input[@id='Email' and @name='Email']"));                                    //using and
	   //WebElement eMail=driver.findElement(By.xpath("//input[@id='Email' or @name='Email']"));                                      //using or
	   //WebElement eMail=driver.findElement(By.xpath("//div[@class='inputs']//input[@id='Email']"));                                 //from parent to child
	   //WebElement eMail=driver.findElement(By.xpath("//input[@name='Email']//parent::div"));                                        //using parent - error
	   //WebElement eMail=driver.findElement(By.xpath("//div[@class='inputs']//label[@for='Email']//following-sibling::input"));        //using sibling
	   //WebElement eMail=driver.findElement(By.xpath("//label[text()='Email:']"));                                                    //using text() - error
	   WebElement eMail=driver.findElement(By.xpath("//input[contains(@id,'E')]"));                                                   //using contains()
	   //WebElement eMail=driver.findElement(By.xpath("//input[starts-with(@name,'E')]"));                                           //using starts-with()
	   eMail.sendKeys("noora@gmail.com");  
	    
	    
	    
	   //WebElement password=driver.findElement(By.xpath("//input[@name='Password']"));
	   //WebElement password=driver.findElement(By.xpath("//input[@name='Password' and @id='Password']"));
	   //WebElement password=driver.findElement(By.xpath("//input[@name='Password' or @id='Password']"));
	   //WebElement password=driver.findElement(By.xpath("//div[@class='inputs']//input[@name='Password']"));
	   //WebElement password=driver.findElement(By.xpath("//input[@name='Password']//parent::div"));                             //using parent- error
	   //WebElement password=driver.findElement(By.xpath("//div[@class='inputs']//label[@for='Password']//following-sibling::input"));    //by sibling
	   //WebElement password=driver.findElement(By.xpath("//label[text()='Password:']"));            //using text() - error                 //using text()
	   //WebElement password=driver.findElement(By.xpath("//input[contains(@class,'search-box-text ui-autocomplete-input')]"));           //using contains() - error
	   WebElement password=driver.findElement(By.xpath("//input[starts-with(@id,'Passw')]"));
	   password.sendKeys("noora1996");          
	    
	    
	    
	   //WebElement confirmPassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));                                     //using tag, attribute and value
	   //WebElement confirmPassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword' and @name='ConfirmPassword']"));          //using and
	   //WebElement confirmPassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword' or @name='ConfirmPassword']"));           //using or
	   //WebElement confirmPassword=driver.findElement(By.xpath("//div[@class='inputs']//input[@id='ConfirmPassword']"));                //from parent to child
	   //WebElement confirmPassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']//parent::div"));             //using parent-error         //using parent
	   //WebElement confirmPassword=driver.findElement(By.xpath("//div[@class='inputs']//label[@for='ConfirmPassword']//following-sibling::input"));      //using sibling
	   //WebElement confirmPassword=driver.findElement(By.xpath("//label[text()='Confirm password:']"));                                                    //using text()- error     
	   //WebElement confirmPassword=driver.findElement(By.xpath("//input[contains(@name,'ConfirmPassword')]"));                                              //using contains()
	   WebElement confirmPassword=driver.findElement(By.xpath("//input[starts-with(@name,'Con')]"));                                                        //using starts-with()
	   confirmPassword.sendKeys("noora1996");       
	    
	    
	    
	     //WebElement registerButton=driver.findElement(By.xpath("//input[@name='register-button']"));                                       //using tag, attribute and value
	     //WebElement registerButton=driver.findElement(By.xpath("//input[@name='register-button' and @id='register-button']"));             //using and
	     //WebElement registerButton=driver.findElement(By.xpath("//input[@name='register-button' or @id='register-button']"));              //using or
	     //WebElement registerButton=driver.findElement(By.xpath("//div[@class='buttons']//input[@name='register-button']"));               //from parent to child
	     //WebElement registerButton=driver.findElement(By.xpath("//input[@name='register-button']//parent::div"));                         //using parent - error
	     //WebElement registerButton=driver.findElement(By.xpath("//input[contains(@name,'register-button')]"));                            //using contains()
	     WebElement registerButton=driver.findElement(By.xpath("//input[starts-with(@name,'reg')]"));
	     registerButton.click();
	     
	    
	    driver.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commands obj=new Commands();
		//obj.verifySwagLabsLogin();
		//obj.verifyDemoWebshopLogin();
		//obj.verifyLinkText();
		//obj.verifyPartialLinkText();
		//obj.verifyDemo2Registration();
		//obj.verifyDemoWebshopLoginXpath();
		//obj.verifyDemoWebshopLoginCssSelector();
		obj.relativeXpath();
		
	}

}
