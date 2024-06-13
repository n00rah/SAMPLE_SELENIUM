package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	public static String getStringData(int rownumber,int columnnumber,String sheetname)
	{
		try
		{
		f=new FileInputStream("C:\\Users\\NOORA\\git\\SAMPLE_SELENIUM\\SAMPLE_SELENIUM\\src\\main\\resources\\TestData.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheetname);
		Row r=s.getRow(rownumber);
		Cell c=r.getCell(columnnumber);
		return c.getStringCellValue();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Excel Sheet Not Found");
		
		}
	}
	public static String getIntegerData(int rownumber,int columnnumber,String sheetname) 
	{
		try
		{
		f=new FileInputStream("C:\\Users\\NOORA\\git\\SAMPLE_SELENIUM\\SAMPLE_SELENIUM\\src\\main\\resources\\TestData.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheetname);
		Row r=s.getRow(rownumber);
		Cell c=r.getCell(columnnumber);
		int x=(int)c.getNumericCellValue();
		return String.valueOf(x);
		}
		catch(Exception e)
		{
			throw new RuntimeException("Excel Sheet Not Found");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
