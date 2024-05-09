package sample_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverCommandsChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.seleniumeasy.com/");    //get() - to launch a url

String s=driver.getTitle();         //to get the title text of current web page 
System.out.println(s);

String url=driver.getCurrentUrl();    //to get the url of current web page
System.out.println(url);

String handleid=driver.getWindowHandle();    //to get handle id of a web page
System.out.println(handleid);

String source=driver.getPageSource();       //to get the source code of current web page
System.out.println(source);

driver.close();    //to close current web page
	}

}
