package webTable;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ChromeBrowser;

public class MaxPrice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> row=driver.findElements(By.xpath("//table//tbody//tr"));
		int rowsize=row.size();
		
		double maxPrice=0;
		for(int i=1;i<rowsize;i++)
		{
			WebElement currentPrice=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			String price=currentPrice.getText();
			double d=Double.parseDouble(price);
			if(d>maxPrice)
			{
				maxPrice=d;
				
			}
			
	}
		System.out.println(maxPrice);
		

	}

}
