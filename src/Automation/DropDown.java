package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement dd=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select select=new Select(dd);
		//3 methods of select class, used either 1 of following
		//select.selectByValue("option1");
		
		
		select.selectByVisibleText("Option2");
		
		//select.selectByIndex(1);

	}

}
