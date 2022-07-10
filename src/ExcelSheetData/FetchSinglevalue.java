package ExcelSheetData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Automation.ChromeBrowser;

public class FetchSinglevalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String us=FetchSinglevalue.sheetExcel("file1",0,0);
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys(us);
	
		String pw=FetchSinglevalue.sheetExcel("file1",1,1);
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys(pw);
		screenshot(driver);
		
		
	}
	
	public static String sheetExcel(String sheetname, int row, int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("G:\\selenium tool\\Book1.xlsx");
		//String value=WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
		String value=WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
		return value;
		
	}
	public static void screenshot(WebDriver driver) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest=new File("G:\\Sarita_VelocityClassnotes_SoftwareTesting\\AutSS\\name.jpeg");

		FileHandler.copy(source,dest);
	}

}
