package keyboard;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Automation.*;
public class ActionClassKeyBoard {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://demoqa.com/text-box");
		
		WebElement fullname=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		fullname.sendKeys("sarita");
		
		
		Actions a=new Actions(driver);
		//for single press tab
		a.sendKeys(Keys.TAB);//method of action class which is sends all keys from keyboard
        a.sendKeys("s@gmail.com");
        
        a.sendKeys(Keys.TAB);
        a.sendKeys("PimpleGUrav,Pune");
        
        
        a.keyDown(Keys.CONTROL);//keydwon use to continuos press
        a.sendKeys("a");
        a.keyUp(Keys.CONTROL);
        
        
        a.keyDown(Keys.CONTROL);
        a.sendKeys("c");
        a.keyUp(Keys.CONTROL);
        
        
        a.sendKeys(Keys.TAB);
        a.keyDown(Keys.CONTROL);
        a.sendKeys("v");
        a.keyUp(Keys.CONTROL);
        a.sendKeys(Keys.DELETE);
        
        a.keyDown(Keys.CONTROL);
        a.sendKeys("a");
        a.keyUp(Keys.CONTROL);
        a.sendKeys(Keys.DELETE);
        
        a.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        a.sendKeys(Keys.ENTER);
        
       a.build().perform();
      
       // a.build().perform();//perform use for single action perform and build () method use to bind multiple actions
	}

}
