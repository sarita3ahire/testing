package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://nxtgenaiacademy.com/alertandpopup/");
		WebElement PAB=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		PAB.click();
		
		Alert a=driver.switchTo().alert();
		a.sendKeys("yes");
		a.dismiss();

	}

}
