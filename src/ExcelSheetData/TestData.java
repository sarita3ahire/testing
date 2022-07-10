package ExcelSheetData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create obj
		FileInputStream file=new FileInputStream("G:\\selenium tool\\Book1.xlsx");//create replica and save in file. FileInputStream is a class
		String value=WorkbookFactory.create(file).getSheet("file1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
        
	}

}
