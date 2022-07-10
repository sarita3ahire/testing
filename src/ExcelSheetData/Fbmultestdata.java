package ExcelSheetData;
import Automation.*;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fbmultestdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://www.facebook.com/");
		
		String us=parameterized.multipletestdata("file1",1,1);
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(us);
		
		String pass=parameterized.multipletestdata("file1",0,0);
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys(pass);
	}

}
