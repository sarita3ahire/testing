package ExcelSheetData;

import java.io.File;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchMultipleDatafromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("G:\\\\selenium tool\\\\Book1.xlsx");
		
		Sheet mysheet=WorkbookFactory.create(file).getSheet("file2");
		
		int totalNumberOfRows= mysheet.getLastRowNum();
		int rowCount=totalNumberOfRows;
		System.out.println("Total num of rows "+rowCount);
		
		short totalNumberOfCol=mysheet.getRow(totalNumberOfRows).getLastCellNum();
		int colCount=totalNumberOfCol-1;
		System.out.println("total num of col "+colCount);
		
	//System.out.println("cell type is "+mysheet.getRow(1).getCell(0).getCellType());
		
		for(int i=0; i<=rowCount;i++)
		{
			for(int j=0;j<=colCount;j++)
			{
				Cell myCell=mysheet.getRow(i).getCell(j);
				CellType dataType=myCell.getCellType();
				
				if(dataType==CellType.STRING)
				{
					String value=myCell.getStringCellValue();
					System.out.print(value +" ");
				}
				else if(dataType==CellType.BLANK)
				{
					System.out.print(" ");
				}
				else if(dataType==CellType.NUMERIC)
				{
					double value=myCell.getNumericCellValue();
					System.out.print(value +" ");
				}
				else if(dataType==CellType.BOOLEAN)
				{
					boolean value=myCell.getBooleanCellValue();
					System.out.print(value +" ");	
				}
				
				//fetch using creating all excel in string format
				/*String value=mysheet.getRow(i).getCell(j).getStringCellValue();//1st line
				
				System.out.print(" "+value);//2nd line*/
				
			}
			System.out.println();
		}
		
	}

	

}
