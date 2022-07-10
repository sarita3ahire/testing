package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendkeysJavaExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://www.facebook.com");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement search= driver.findElement(By.xpath("//input[@id='email']"));
		
		js.executeScript("arguments[0].value='sarita';", search);

	}

}
