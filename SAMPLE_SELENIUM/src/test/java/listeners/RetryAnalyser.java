package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer{
int count=0;
int retrylimit=3;
	@Override
	public boolean retry(ITestResult result) //retry is a method of IRetryAnalyzer interface
	{
		// TODO Auto-generated method stub
		if(count<retrylimit)
		{
			count++;
			return true;
		}
		return false;
	}

}
