package ExcelSheetData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterized {

	public static String multipletestdata(String sheetName, int row, int col) throws EncryptedDocumentException, IOException{
		//create obj
				FileInputStream file=new FileInputStream("G:\\selenium tool\\Book1.xlsx");//create replica and save in file. FileInputStream is a class
				String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
				return value;

	}

}
