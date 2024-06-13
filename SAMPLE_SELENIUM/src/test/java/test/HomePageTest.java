package test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import listeners.RetryAnalyser;
import utilities.ExcelUtility;

public class HomePageTest extends Base
{
@Test(retryAnalyzer=RetryAnalyser.class)   //retry not executed, because test case is passed

public void verifyHomePageTitle()
{
  driver.get("https://demowebshop.tricentis.com/");
  String actualtitle=driver.getTitle();
	System.out.println("WEB PAGE TITLE :"+actualtitle);
	String expectedTitle=ExcelUtility.getStringData(0,0,"HomePage");
	Assert.assertEquals(actualtitle,expectedTitle,"HOME PAGE TITLE MISMATCH"); 
}

@Test

public void verifyCommunityPollSelection()
{
		driver.get("https://demowebshop.tricentis.com/");
		
	    List<WebElement> communitypoll=driver.findElements(By.xpath("//li[@class=\'answer\']"));
	    int size=communitypoll.size();
	    System.out.println("NUMBER OF ELEMENTS : "+size);
		//WebElement radiogood=driver.findElement(By.xpath("//input[@id=\"pollanswers-2\"]"));
		
		for(int i=0;i<=size;i++)
	    {
		String value=communitypoll.get(i).getText();
		System.out.println(value);
		if(value.equals("Good"))
		{
	      communitypoll.get(i).click();
        }	
		
		/*boolean selectionStatus=radiogood.isSelected();
		System.out.println("GOOD OPTION SELECTION STATUS="+selectionStatus);
		Assert.assertTrue(selectionStatus,"NOT SELECTED");*/
	}
}













}
