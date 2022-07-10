package popup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement simplealert=driver.findElement(By.xpath("//input[@value='Alert']"));
		simplealert.click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		screenshot(driver, "simple");
		
		Thread.sleep(2000);
		WebElement confirmationalert=driver.findElement(By.xpath("//input[@value='Confirmation Box']"));
		confirmationalert.click();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.dismiss();
		screenshot(driver, "confirmation");
		
		
		
		WebElement promptalert=driver.findElement(By.xpath("//input[@value='Prompt']"));
		promptalert.click();
		Thread.sleep(2000);
		a.sendKeys("sarita");
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		screenshot(driver, "prompt");
		
		
		Thread.sleep(2000);
		WebElement doubleClick=driver.findElement(By.xpath("//input[@id='double-click']"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleClick).perform();
		System.out.println(a.getText());
		a.accept();
		screenshot(driver, "doubleclick");
		
		
		Thread.sleep(2000);
		WebElement submenu=driver.findElement(By.xpath("//button[text()='Sub Menu [Hover On Me]']"));
		act.moveToElement(submenu).perform();
		WebElement google=driver.findElement(By.xpath("//a[text()='Google']"));
		google.click();
		screenshot(driver, "googleoprn");
		
		
	}
	public static void screenshot(WebDriver driver,String name) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("G:\\Sarita_VelocityClassnotes_SoftwareTesting\\AutSS\\"+name+".jpg");
		FileHandler.copy(source, dest);
	}

}
