package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ChromeBrowser;

public class FindValuefromWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		WebElement PrevClose=driver.findElement(By.xpath("//table//tbody//tr[6]//td[3]"));
		System.out.println(PrevClose.getText()); 
		

	}

}
