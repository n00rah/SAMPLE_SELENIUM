package sample_selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	   WebElement eMail=driver.findElement(By.xpath("//input[contains(@id,'Email')]"));                                                   //using contains()
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
	
	
	public void verifyIsSelected()
	{
		boolean isButtonSelected;
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement radiobuttonFemale=driver.findElement(By.xpath("//input[@id='gender-female']"));
		isButtonSelected=radiobuttonFemale.isSelected();
		System.out.println("Female element before selected : "+isButtonSelected);
		radiobuttonFemale.click();
		isButtonSelected=radiobuttonFemale.isSelected();
		System.out.println("Female element after selected : "+isButtonSelected);
		driver.close();
	}
	
	public void verifyIsEnabled()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement subscribeButton=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
	boolean isButtonEnabled=subscribeButton.isEnabled();
	System.out.println("Button is Enabled : "+isButtonEnabled);
	driver.close();
	}
	
	
	public void verifyIsDisplayed()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement voteButton=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		boolean displayed=voteButton.isDisplayed();
		System.out.println("vote button display status : "+displayed);
		driver.close();	
	}
	
	
	public void cssSelectorTNAV()
	{
		
		//CSS SELECTOR : TAG NAME, ATTRIBUTE AND VALUE
		//             : tagname[attribute='value']
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		WebElement loginMenu=driver.findElement(By.cssSelector("a[class='ico-login']"));
		loginMenu.click();
		WebElement eMail=driver.findElement(By.cssSelector("input[id='Email']"));
		eMail.sendKeys("noorajahangeer1996@gmail.com");
		WebElement password=driver.findElement(By.cssSelector("input[id='Password']"));
		password.sendKeys("noora1996");
		WebElement loginButton=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
		loginButton.click();
		driver.close();	
		
	}
	
	
	public void cssSelectorTNID()
	{
		//CSS SELECTOR : TAG NAME AND ID
		//             : tagname#idvalue
		//             : #idvalue
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		WebElement loginMenu=driver.findElement(By.cssSelector("a[class='ico-login']"));
		loginMenu.click();
		//WebElement eMail=driver.findElement(By.cssSelector("input#Email"));
		WebElement eMail=driver.findElement(By.cssSelector("#Email"));
		eMail.sendKeys("noorajahangeer1996@gmail.com");
		//WebElement password=driver.findElement(By.cssSelector("input#Password"));
		WebElement password=driver.findElement(By.cssSelector("#Password"));
		password.sendKeys("noora1996");
		WebElement loginButton=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
		loginButton.click();
		driver.close();	
	
	}
	
	
	public void cssSelectorTNC()
	{
		//CSS SELECTOR : TAG NAME AND CLASSS
		//             : tagname.classvalue
		//             : .classvalue
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		WebElement loginMenu=driver.findElement(By.cssSelector("a[class='ico-login']"));
		loginMenu.click();
		WebElement eMail=driver.findElement(By.cssSelector("input.email"));
		//WebElement eMail=driver.findElement(By.cssSelector(".email"));
		eMail.sendKeys("noorajahangeer1996@gmail.com");
		WebElement password=driver.findElement(By.cssSelector("input.password"));
		//WebElement password=driver.findElement(By.cssSelector(".password"));
		password.sendKeys("noora1996");
		WebElement loginButton=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
		loginButton.click();
		driver.close();	
		
		
	}
	
	
	
public void verifyValuesFromDropDown()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	WebElement countryList=driver.findElement(By.xpath("//select[@name='country']"));
	Select select=new Select(countryList);
	//select.selectByVisibleText("ANDORRA");           //select element using visible text
	//select.selectByIndex(5);                           //select element by index position
	select.selectByValue("AMERICAN SAMOA");              //select element using text value
	WebElement getCountryName=select.getFirstSelectedOption();
	System.out.println(getCountryName.getText());           //to print selected element in console
	
	
	driver.close();
	
}
	

public void getTotalDropDownValues()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	WebElement countryList=driver.findElement(By.xpath("//select[@name='country']"));
	Select select=new Select(countryList);
	List<WebElement>dropdownlist=select.getOptions();
	System.out.println("Total number of values in drop down list : "+dropdownlist.size());	
}


public void verifySingleInputField()             
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	driver.manage().window().maximize();
	
	WebElement enterMessageField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	enterMessageField.sendKeys("SINGLE INPUT FIELD DEMO CHECK");
	
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	showMessageButton.click();
	
	WebElement showText=driver.findElement(By.xpath("//div[@id='message-one']"));
	String st=showText.getText();
	System.out.println(st);	
	
	driver.close();
}


public void verifyTwoInputFields()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	driver.manage().window().maximize();
	
	WebElement enterValueAField=driver.findElement(By.xpath("//input[@id='value-a']"));
	enterValueAField.sendKeys("20");
	
	WebElement enterValueBField=driver.findElement(By.xpath("//input[@id='value-b']"));
	enterValueBField.sendKeys("30");
	
	WebElement getTotalField=driver.findElement(By.xpath("//button[@id='button-two']"));
	getTotalField.click();
	
	WebElement viewTotalField=driver.findElement(By.xpath("//div[@id='message-two']"));
	String st=viewTotalField.getText();
	System.out.println(st);
	
	driver.close();
}


public void verifyCheckBoxDemo()              
{
	boolean cb;
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/check-box-demo.php");
	driver.manage().window().maximize();
	
	WebElement checkBox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	cb=checkBox1.isSelected();
	
	System.out.println("CHECKBOX SELECTION STATUS BEFORE SELECTED : "+cb);
	checkBox1.click();
	
	cb=checkBox1.isSelected();
	System.out.println("CHECKBOX SELECTION STATUS AFTER SELECTED : "+cb);
	
	WebElement showCheck=driver.findElement(By.xpath("//div[@id='message-one']"));
	String st=showCheck.getText();
	System.out.println("CHECK BOX SELECTION STATUS : "+st);
	
	driver.close();
}


public void verifyRadioButtonsDemo()            
{
	boolean rb;
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/radio-button-demo.php");
	driver.manage().window().maximize();
	
	WebElement radioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	rb=radioButton.isSelected();
	System.out.println("RADIO BUTTON SELECTION STATUS BEFORE SELECETION : "+rb);
	
	radioButton.click();
	rb=radioButton.isSelected();
	System.out.println("RADIO BUTTON SELECTION STATUS AFTER SELECETION : "+rb);
	
	WebElement showSelectedValueButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	showSelectedValueButton.click();
	
	WebElement radioSelectionText=driver.findElement(By.xpath("//div[@id='message-one']"));
	String st=radioSelectionText.getText();
	System.out.println("SELECTED GENDER IN CHECKBOX : "+st);

	driver.close();
}


public void verifyColorFromDropDown()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/select-input.php");
	driver.manage().window().maximize();
	
	WebElement colorDropList=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select select=new Select(colorDropList);
	select.selectByValue("Red");
	
	//select.selectByValue("Yellow");
	//select.selectByIndex(2);
	//select.selectByIndex(3);
	//select.selectByVisibleText("Green");
	//select.selectByVisibleText("Yellow");
	
	WebElement selectedColor=select.getFirstSelectedOption();
	System.out.println("FIRST SELECETED COLOR : "+selectedColor.getText());
	
	driver.close();
}
	

public void verifySimpleAlert()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	
	WebElement alertSimple=driver.findElement(By.xpath("//button[@id='alertButton']"));
	alertSimple.click();
	
	Alert alert=driver.switchTo().alert();             //to switch to alert
	alert.accept();
	
	driver.close();

}


public void verifyConfirmationAlert()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	
	WebElement SimpleAlert=driver.findElement(By.xpath("//button[@id='confirmButton' and @class='btn btn-primary']"));
	SimpleAlert.click();
	
	Alert alert=driver.switchTo().alert();
	
	String st1=alert.getText();
	System.out.println("ALERT MESSAGE : "+st1);
	alert.dismiss();
	//alert.accept();
	
	WebElement alertConfirmationText=driver.findElement(By.xpath("//span[@id='confirmResult']"));
	String st=alertConfirmationText.getText();
	System.out.println("CONFIRMATION ALERT SELECTION STATUS : "+st);
	
	driver.close();
	
}

public void verifypromptAlert()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	
	WebElement PromptAlert=driver.findElement(By.id("promtButton"));
	PromptAlert.click();
	
	Alert alert=driver.switchTo().alert();
	String st1=alert.getText();
	System.out.println(st1);
	
	alert.sendKeys("noora");
	alert.accept();
	
	WebElement alertPrompt=driver.findElement(By.xpath("//span[@id='promptResult']"));
	String st2=alertPrompt.getText();
	System.out.println(st2);
	
	driver.close();
}


public void verifyCustomerForm()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	
	//WebElement customerId=driver.findElement(By.name("//input[@name='cusid']"));
	WebElement customerId=driver.findElement(By.xpath("	//input[@name='cusid' and @type='text']"));
	customerId.sendKeys("12345");
	
	//WebElement submitButton=driver.findElement(By.name("//input[@name='submit']"));
	WebElement submitButton=driver.findElement(By.xpath("//input[@name='submit' and @type='submit']"));
	submitButton.click();

	Alert alert=driver.switchTo().alert();               //switch to alert
	
	String st1=alert.getText();                          //to get text before click - ALERT 1
	System.out.println("FIRST ALERT MESSAGE : "+st1);
	
	alert.accept();                                         //click ok button - ALERT 1
	
	String st2=alert.getText();                              //to get text after click / to get text of ALERT 2
	System.out.println("SECOND ALERT MESSAGE : "+st2);
	
	alert.accept();                                         //click ok button - ALERT 2
	
	driver.close();
	
}

//**********MOUSE ACTIONS************


public void verifyRightClick()
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	
	WebElement rightClick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions actions=new Actions(driver);
	actions.contextClick(rightClick).build().perform();       //to perform right click
	
	driver.close();	
	
}



public void verifyDoubleClick()
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	
	WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions actions=new Actions(driver);
	actions.doubleClick(doubleClick).build().perform();
	
	Alert alert=driver.switchTo().alert();
	String st=alert.getText();
	System.out.println(st);
	
	alert.accept();
	
	driver.close();
	
}



public void verifyDragAndDrop()
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/droppable");
	driver.manage().window().maximize();
	
	WebElement dragButton=driver.findElement(By.xpath("//div[@id='draggable']"));
	
	WebElement dropButton=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
	
	Actions actions=new Actions(driver);
	actions.dragAndDrop(dragButton, dropButton).build().perform();
	
	driver.close();	
	
}



public void verifyDragAndDropOffset()
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/dragabble");
	driver.manage().window().maximize();
	
	WebElement dragButton=driver.findElement(By.xpath("//div[@id='dragBox']"));
	
	Actions actions=new Actions(driver);
	actions.dragAndDropBy(dragButton, 150, 100).build().perform();
	
	driver.close();
	
}



public void verifyMouseOver()
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/menu/");
	driver.manage().window().maximize();
	
	WebElement mainListMenu=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	
	Actions actions=new Actions(driver);
	actions.moveToElement(mainListMenu).build().perform();
	
	WebElement subListMenu=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
	actions.moveToElement(subListMenu).build().perform();
	
	driver.close();
	
}


//**************FILE UPLOAD****************


public void verifyFileUpload()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	driver.manage().window().maximize();
	
	WebElement chooseFileButton=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	chooseFileButton.sendKeys("C:\\Users\\NOORA\\git\\SAMPLE_SELENIUM\\SAMPLE_SELENIUM\\src\\main\\resources\\SELENIUM.docx");
	
	WebElement checkBoxButton=driver.findElement(By.xpath("//input[@id='terms']"));
	checkBoxButton.click();
	
	WebElement submitButton=driver.findElement(By.xpath("//button[@id='submitbutton']"));
	submitButton.click();
	
	driver.close();
	
}


public void fileUploadPractice()
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	driver.manage().window().maximize();
	
	WebElement chooseFileButton=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	chooseFileButton.sendKeys("C:\\Users\\NOORA\\git\\SAMPLE_SELENIUM\\SAMPLE_SELENIUM\\src\\main\\resources\\istqbreg.docx");
	
	WebElement checkBoxButton=driver.findElement(By.xpath("//input[@id='terms']"));
	checkBoxButton.click();
	
	WebElement submitButton=driver.findElement(By.xpath("//button[@id='submitbutton']"));
	submitButton.click();
	
	driver.close();	
	
}

public void verifyDragNDrop()
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/drag-drop.php");
	driver.manage().window().maximize();
	
	WebElement dragField1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement dragField2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	WebElement dragField3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
	WebElement dragField4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
	
	WebElement dropField=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	
	Actions actions=new Actions(driver);
	
	actions.dragAndDrop(dragField1, dropField).build().perform();
	actions.dragAndDrop(dragField2, dropField).build().perform();
	actions.dragAndDrop(dragField3, dropField).build().perform();
	actions.dragAndDrop(dragField4, dropField).build().perform();
	
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
		//obj.relativeXpath();
		//obj.verifyIsSelected();
		//obj.verifyIsEnabled();
		//obj.verifyIsDisplayed();
		//obj.cssSelectorTNAV();
		//obj.cssSelectorTNC(); 
		//obj.cssSelectorTNID();
		//obj.verifyValuesFromDropDown();
		//obj.getTotalDropDownValues();
		//obj.verifySingleInputField();
		//obj.verifyTwoInputFields();
		//obj.verifyCheckBoxDemo();
		//obj.verifyRadioButtonsDemo();
		//obj.verifyColorFromDropDown();
		//obj.verifySimpleAlert();
		//obj.verifyConfirmationAlert();
		//obj.verifypromptAlert();
		//obj.verifyCustomerForm();
		//obj.verifyRightClick();
		//obj.verifyDoubleClick();
		//obj.verifyDragAndDrop();
		//obj.verifyDragAndDropOffset();
		//obj.verifyMouseOver();
		//obj.verifyFileUpload();
		//obj.fileUploadPractice();
		obj.verifyDragNDrop();
		
		
		
		
		
		
	};
	

}
