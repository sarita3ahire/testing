package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ChromeBrowser;


public class iframe_multiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("http://demo.automationtesting.in/Frames.html");
		
		WebElement doubleframe=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		doubleframe.click();
		
		WebElement outerframe=driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe=driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(innerframe);
		
		WebElement textfield=driver.findElement(By.xpath("//input[@type='text']"));
		textfield.sendKeys("sarita");
		
		driver.switchTo().defaultContent();//revert back on home page
		//driver.switchTo().parentFrame();//revert back on current parent page
		
		WebElement register=driver.findElement(By.xpath("//a[@href='Register.html']"));
		System.out.println(register.getText());
		
	
		
		
		

	}

}
