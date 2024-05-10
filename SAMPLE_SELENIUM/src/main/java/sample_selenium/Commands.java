package sample_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {
/*public void verifySwagLabsLogin()
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
}*/
public void verifyDemoWebshopLogin()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().getImplicitWaitTimeout();
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebElement loginmenu=driver.findElement(By.className("ico-login"));
	loginmenu.click();
	WebElement emailidfield=driver.findElement(By.id("Email"));
	emailidfield.sendKeys("noorajahangeer1996@gmail.com");
	WebElement passwordfield=driver.findElement(By.id("Password"));
	passwordfield.sendKeys("noora1996");
	WebElement remembermebox=driver.findElement(By.name("RememberMe"));
	remembermebox.click();
	WebElement loginbutton=driver.findElement(By.className("button-1 login-button"));
	loginbutton.click();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commands obj=new Commands();
		//obj.verifySwagLabsLogin();
		obj.verifyDemoWebshopLogin();
		
	}

}
