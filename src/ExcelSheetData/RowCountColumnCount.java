package ExcelSheetData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowCountColumnCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("G:\\selenium tool\\Book1.xlsx");
		   Sheet book=WorkbookFactory.create(file).getSheet("file2");


		   int RowCount=book.getLastRowNum()+1;
		   System.out.println(RowCount);
		   int ColCount=book.getRow(0).getLastCellNum();
		   System.out.println(ColCount);
		  
		   for(int i=0; i<RowCount;i++)
		   {
		    for(int j=0;j<ColCount;j++)
		    {
		     CellType type=book.getRow(i).getCell(j).getCellType();
		     
		     if(type==CellType.STRING)
		     {
		      System.out.print(book.getRow(i).getCell(j).getStringCellValue()+ "  ");
		     }
		     else if(type==CellType.BOOLEAN)
		     {
		      System.out.print(book.getRow(i).getCell(j).getBooleanCellValue()+ "  ");
		     }
		     else if(type==CellType.NUMERIC)
		     {
		      System.out.print(book.getRow(i).getCell(j).getNumericCellValue()+"  ");
		     }
		     else
		     {
		      System.out.print(" ");
		     }
		 }
		    System.out.println();
		 }
	}
}
