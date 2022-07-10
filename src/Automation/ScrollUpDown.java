package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		/*
		WebElement elementDisplayed=driver.findElement(By.xpath("(//legend[@style='margin-bottom:15px;'])[1]"));
		 
		Thread.sleep(2000);
		 //scrolldown for particular webelement, this will scroll the page till element is found
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", elementDisplayed);
		//OR
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", elementDisplayed);
		
		//scroldown randomly on page using coordinates
		((JavascriptExecutor)driver).executeScript(("window.scrollBy(300,500)"));*/
		//Thread.sleep(2000);
		//down ---2nd parameter ,+ve value
		//((JavascriptExecutor)driver).executeScript(("window.scrollBy(0,500)"));
		/*Thread.sleep(2000);
		//up ---2nd parameter, -ve vale
		((JavascriptExecutor)driver).executeScript(("window.scrollBy(0,-500)"));
		
		//right --1st parameter, +ve value
		((JavascriptExecutor)driver).executeScript(("window.scrollBy(300,0)"));
		Thread.sleep(2000);
		//left ---1st parameter, -ve value
		((JavascriptExecutor)driver).executeScript(("window.scrollBy(-300,0)"));
		*/
		
		
		//Alternate way to sendkeys
		
		WebElement UN= driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].value='sarita'",UN);
		

	}

}
