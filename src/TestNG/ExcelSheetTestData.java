package TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelSheetData.*;

public class ExcelSheetTestData {
	String value,value1;
	@BeforeTest
	public void Exceldata() throws EncryptedDocumentException, IOException
	{
		value=parameterized.multipletestdata("file1",1,1);//call static method of excelsheet
		value1=parameterized.multipletestdata("file2",0,0);
	}
	@DataProvider(name="ExcelData")
	public Object[][] ExcelData()
	{
		return new Object[][] {{value},{value1}};
	}
	@Test(dataProvider="ExcelData")
	public void data(String name)
	{
		System.out.println(name);
	}

}
