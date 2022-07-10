package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ParameterizationExcelData {
	String value1, value2;
	@BeforeTest
	public void multipletestdata() throws EncryptedDocumentException, IOException{
		int i;
		FileInputStream file=new FileInputStream("G:\\selenium tool\\Book1.xlsx");//create replica and save in file. FileInputStream is a class
	 
		
		value1=WorkbookFactory.create(file).getSheet("file1").getRow(1).getCell(1).getStringCellValue();
		
      //  System.out.println(value1);
}
	@DataProvider(name="ExcelData")
	public Object[][] ExcelData()
	{
		return new Object[][] {{value1},{value2}};
	}
	@Test(dataProvider="ExcelData")
	public void data(String name)
	{
		System.out.println(name);
		
	}
}

