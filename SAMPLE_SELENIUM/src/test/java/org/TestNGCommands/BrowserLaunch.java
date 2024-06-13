package org.TestNGCommands;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserLaunch {
WebDriver driver;
	public void initialiseBrowser(String browser)
	{
		if(browser.equals("Chrome"))
				{
			driver=new ChromeDriver();
			
				}
		else if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			throw new RuntimeException("INVALID BROWSER");
		}
		driver.manage().window().maximize();
	}
	@BeforeMethod
	 public void setUp()
	 {
		 initialiseBrowser("Chrome");
	 }
	@AfterMethod
	 public void closeBrowser(ITestResult result) throws Exception
	 {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			takeScreenShot(result);
		}
		 driver.close();
	 }
public void takeScreenShot(ITestResult result) throws Exception
{
	TakesScreenshot takescreenshot=(TakesScreenshot) driver;
	File screenshots=takescreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshots, new File("./Screen Shot/"+result.getName()+".png"));
	
	
}
}

