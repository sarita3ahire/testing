package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ChromeBrowser;

public class AllPriceFromSameCol {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=ChromeBrowser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> row=driver.findElements(By.xpath("//table//tbody//tr"));
		int rowsize=row.size();
		
		double Price=0;
		for(int i=1;i<rowsize+1;i++)
		{
			WebElement currentPrice=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			String colprice=currentPrice.getText();
			double d=Double.parseDouble(colprice);
			if(d<Price)
			{
				Price=d;
				
			}
			System.out.println(d);	
			
	}
		

	}

	}


