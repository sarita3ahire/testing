package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=Browser.openBrowser("https://www.facebook.com/");
		WebDriver driver=ChromeBrowser.openBrowser("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("ahire.sarita1@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Rits@123");
		
		WebElement login= driver.findElement(By.tagName("button"));
		login.click();
		
		
		
		WebElement profile=driver.findElement(By.xpath("//span[text()='Er Sarita Ahire']"));
		profile.click();
		
		
		
		
		
		
		WebElement arrowoption = driver.findElement(By.cssSelector("path[d='M10 14a1 1 0 0 1-.755-.349L5.329 9.182a1.367 1.367 0 0 1-.205-1.46A1.184 1.184 0 0 1 6.2 7h7.6a1.18 1.18 0 0 1 1.074.721 1.357 1.357 0 0 1-.2 1.457l-3.918 4.473A1 1 0 0 1 10 14z']"));
		arrowoption.click();
		
		
		/*WebElement email=driver.findElement(By.xpath("//input[@id=\"identifierId\"]"));
		email.sendKeys("ahire.sarita1@gmail.com");
		
		WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		
		WebElement pass=driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
		pass.sendKeys("Sarita123@");
		*/
	}

}
