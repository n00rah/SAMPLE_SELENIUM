package org.TestNGCommands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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

@Test

public void verifyDynamicWebTable()
{
	driver.get("https://money.rediff.com/indices/nse");
	
	WebElement showMore=driver.findElement(By.xpath("//a[@id='showMoreLess']"));	
	showMore.click();
	
	WebElement table=driver.findElement(By.xpath("//table[@id='dataTable']"));
	//************To print all table*****************
	//System.out.println(table.getText());
	
	WebElement tableRow=driver.findElement(By.xpath("//table[@id='dataTable']/tBody/tr[5]"));  //locating 5th row
	//***********To print a specific row****************
	System.out.println(tableRow.getText());
	
	
	List<WebElement> rows=table.findElements(By.tagName("tr"));    //locating rows and storing in a list
	int rowsCount=rows.size();
	for(int i=0;i<rowsCount;i++)
	{
		List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));  //locating rcolumn and storing in a list
		int colcount=columns.size();
		for(int j=0;j<colcount;j++)
		{
			String cellData=columns.get(j).getText();
			//System.out.println(cellData);
			if(cellData.equals("NIFTY IT"))
					{
				System.out.println("LAST TRADED : "+columns.get(2).getText());   //print data of particular cell
					}
			{
				
			}
		}
		
		
	}
	
	 
}


@Test
public void dynamicTablePractice()
{
driver.get("https://money.rediff.com/indices/nse");
	
	WebElement showMore=driver.findElement(By.xpath("//a[@id='showMoreLess']"));	
	showMore.click();
	WebElement table=driver.findElement(By.xpath("//table[@id='dataTable']"));
	//System.out.println(table.getText());
	
	WebElement tableRow=driver.findElement(By.xpath("//table[@id='dataTable']/tBody/tr[2]"));
	System.out.println(tableRow.getText());
	
    List<WebElement> rows=table.findElements(By.tagName("tr"));
    int rowsCount=rows.size();
    for(int i=0;i<rowsCount;i++)
    {
    	List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
    	int columnCount=columns.size();
    	for(int j=0;j<columnCount;j++)
    	{
    		String cellType=columns.get(j).getText();
    		if(cellType.equals("NIFTY NEXT 50"))
    		{
    			System.out.println("Prev Close Value is : "+columns.get(1).getText());
    		}
    	}
    }
	
}

@Test

public void verifyWaitCommands()
{
	driver.get("https://demoqa.com/alerts");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton")));
	WebElement clickButton=driver.findElement(By.id("timerAlertButton"));
	clickButton.click();
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert=driver.switchTo().alert();
	alert.accept();
}



@Test

public void verifyFluentWait()
{
	driver.get("https://demoqa.com/alerts");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	WebElement clickButton=driver.findElement(By.id("timerAlertButton"));
	FluentWait wait=new FluentWait(driver);
	wait.withTimeout(Duration.ofSeconds(10));
	//wait.pollingEvery(Duration.ofSeconds(3));   //frequent wait
	//wait.ignoring(NoSuchElementException.class);  //to ignore exceptions
	clickButton.click();
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	}

@Test

public void collection()
{
	//***********arraylist instantiation***********
	ArrayList<String> fruits=new ArrayList<String>();
	//*************adding list elements**************
	fruits.add("Apple");
	fruits.add("Mango");
	fruits.add("Orange");
	fruits.add("Grapes");
	fruits.add("Kiwi");
	fruits.add("Apple");
	System.out.println("********Fruits*********");
	//***********print list elements as array****************
	//System.out.println(fruits);
	//************print list elements as string using for each loop***************
	//for(String i:fruits)
	//{
	//	System.out.println(i);
	//}
	//************print list elements as string Iterator interface for each loop***************
	Iterator itr=fruits.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	//***********to remove all elements in list*************
	//fruits.removeAll(fruits);
	//*************to get index number of a list element**************
	//System.out.println(fruits.indexOf("Mango"));
	//****************It will print the last index of dupliacte element*************
	//System.out.println(fruits.lastIndexOf("Apple"));
	
	ArrayList<String> veg=new ArrayList<String>();
	veg.add("tomato");
	veg.add("potato");
	veg.add("carrot");
	veg.add("chilly");
	veg.add("cucumber");
	System.out.println("*******Vegetables*******");
	for(String v:veg)
	{
		System.out.println(v);
	}
	//************to add another collection************
fruits.addAll(veg);
System.out.println(fruits);
//**************to remove second collection*************
fruits.removeAll(veg);
System.out.println("Vegetables list removed "+fruits);
}

@Test
public void collectionWebElements()
{
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	WebElement list1=driver.findElement(By.xpath("//select[@name='country']"));
	Select select=new Select(list1);
	List<WebElement> li=list1.findElements(By.tagName("option"));
for(WebElement i:li)
{
	System.out.println(i.getText());
}
	
	
}
















}
            