package sample_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchChromeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();           // Browser initialisation     WebDriver - interface
driver.get("https://www.seleniumeasy.com/");         //get() - to launch a url
driver.manage().window().maximize();


}

}
