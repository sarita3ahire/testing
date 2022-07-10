package iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.*;

public class iframeMove {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=ChromeBrowser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("courses-iframe");//using id
		//driver.switchTo().frame(0);//using index
		WebElement iframe=driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
		driver.switchTo().frame(iframe);//using webelement
		
	WebElement course=driver.findElement(By.xpath("(//a[@href='https://vctcpune.com/courses/'])[1]"));
		course.click();
		
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		text.sendKeys("sarita");
		


	}

}
