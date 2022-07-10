package webTable;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ChromeBrowser;

public class DisplayHeadingsOfTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		   List<WebElement> headings=driver.findElements(By.xpath("//table//thead//tr//th"));
		   int col=headings.size();
		   for(int i=0;i<col;i++)
		   {
		   System.out.println(headings.get(i).getText());
		  
	}

	}

}
