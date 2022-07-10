package ExcelSheetData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class multipletestdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String abc=parameterized.multipletestdata("file1",1,1);
		System.out.println(abc);
	//	fetchtest data from another excelsheet
		String abc1=parameterized.multipletestdata("file2",0,0);
		System.out.println(abc1);

	}

}
