package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ChromeBrowser;

public class MinPriceFromCol {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> row=driver.findElements(By.xpath("//table//tbody//tr"));
		int rowsize=row.size(); 
		double temp=0;
		for(int i=1;i<rowsize;i++)
		{
			WebElement currentPrice=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			String price=currentPrice.getText();
			double d=Double.parseDouble(price);
			if(d>temp)
			{
				temp=d;
				
			}
			
	}
		System.out.println("max price is "+temp);
		
		for(int j=1;j<rowsize;j++)
		{
			WebElement currentPrice=driver.findElement(By.xpath("//table//tbody//tr["+j+"]//td[4]"));
			String price=currentPrice.getText();
			double d=Double.parseDouble(price);
			if(d>temp)
			{
				temp=d;
				
			}
			
			
	}
		
		System.out.println("Min price is "+temp);
		
		
	}

}
