package mouse;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Automation.*;
public class Drag_drop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://www.globalsqa.com/demo site/draganddrop/");
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		WebElement trashiframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(trashiframe);
		//findelements method use to search all matching xpath and save in list by indexes,, returns list of webelements
	List<WebElement> img1= driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));//this is 4img common matching path, not unique one//List is i/f of java and part of collection framework
	//findelement method use to search address for particular only one element and save in 
		WebElement destination=driver.findElement(By.xpath("//div[@id='trash']"));
		
		
		
		//multiple webelement
		for(int i=0; i<img1.size(); i++)
		{
			
		WebElement pictures=img1.get(i);
		Thread.sleep(2000);
		act.dragAndDrop(pictures,  destination);//source is picture object of webelement for multimple images
		act.perform();
		}
		
		for(int i=img1.size();i>0;i--)
		{
		Thread.sleep(2000);
		
		WebElement refreshundu=driver.findElement(By.xpath("//a[@title='Recycle this image']"));
		refreshundu.click();
		
		}
	}

}
