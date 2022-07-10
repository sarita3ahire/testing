package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		//sendKeys(),click(),isSelected(),isEnabled(),getText(),clear()
		
		WebDriver driver=ChromeBrowser.openBrowser("https://www.calculator.net/");
		driver.manage().window().maximize();
		//isSelected() method
		WebElement search=driver.findElement(By.xpath("//input[@value='rad']"));
		//WebElement search=driver.findElement(By.xpath("//input[@value='deg']"));//input[@value='rad']
	//	boolean b= search.isSelected();
     //  System.out.println(b);
       
       //sendKeys() method
     WebElement sea= driver.findElement(By.xpath("//input[@id='calcSearchTerm']"));
      sea.click();
      
   // sea.sendKeys("Sal");
    Thread.sleep(2000);
    //sea.clear();
    
    WebElement taxcal=driver.findElement(By.xpath("(//a[@href='/sales-tax-calculator.html'])[1]"));
    taxcal.click();
    
   //  WebElement Search= driver.findElement(By.xpath("//span[@id='bluebtn']"));
    //  Search.click();
      WebElement salarycal=driver.findElement(By.xpath("(//a[@href='/salary-calculator.html'])[1]"));
    //  salarycal.click();
    //  boolean n=salarycal.isDisplayed(); //not working on this site
    //  System.out.println(n);
      
      WebElement text=driver.findElement(By.xpath("//h1[text()='Free Online Calculators']"));
     String s= text.getText();
  //   boolean b=s.equals("Free Online Calcu");
   //  System.out.println(b);
        
		
		
		
	}

}
