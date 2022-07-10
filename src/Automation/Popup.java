package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.manage().window().maximize();
		
		WebElement JSprompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		JSprompt.click();
		
		//WebElement JSconfirm=driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
		//JSconfirm.click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		
		
		
	//   String s=  a.getText();
	  //  System.out.println(s);
	
	a.sendKeys("sarita");
	Thread.sleep(2000);
		//a.accept();
		a.dismiss();
		
		//Thread.sleep(9000);
		
		//driver.close();
		
		
		
		
		

	}

}
