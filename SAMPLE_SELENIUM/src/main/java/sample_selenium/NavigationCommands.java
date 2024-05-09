package sample_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.get("https://www.seleniumeasy.com/");

driver.manage().window().maximize();         //to maximize the current window 

driver.navigate().back();                   //for backward navigation

driver.navigate().forward();               //for forward navigation

driver.navigate().refresh();                //to refresh current page

driver.navigate().to("https://mvnrepository.com/");          //to navigate to another webpage

driver.close();             //to close current window
	}

}
