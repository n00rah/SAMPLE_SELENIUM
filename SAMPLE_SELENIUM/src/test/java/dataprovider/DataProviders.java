package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
@DataProvider(name="InvalidUserCredentials")
	public Object[][] verifyUserCredentialsData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="noora321@gmail.com";
		data[0][1]="noora1996";
		
		data[1][0]="noorajahangeer1996@gmail.com";
		data[1][1]="noora";
		
		data[2][0]="noor@gmail.com";
		data[2][1]="noor";
		
		return data;
	}
}
