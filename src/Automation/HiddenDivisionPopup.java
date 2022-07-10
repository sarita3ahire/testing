package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
		WebElement createNewAcc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createNewAcc.click();
		
		Thread.sleep(2000);
		WebElement fstname= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		fstname.sendKeys("Sarita");
		
	WebElement lstname= driver.findElement(By.xpath("//input[@name='lastname']"));
		lstname.sendKeys("Ahire");
		
		
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("ahire.sarita1@gmail.com");
		
		WebElement reemail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reemail.sendKeys("ahire.sarita1@gmail.com");
		
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("sarita3@hire");
		
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
		Select s=new Select(day);
		s.selectByIndex(2);
		
		WebElement month=driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
		Select s1=new Select(month);
		s1.selectByIndex(5);
		
		WebElement year=driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
		Select s2=new Select(year);
		s2.selectByValue("1995");
		
		WebElement gender=driver.findElement(By.xpath("//input[@class='_8esa']"));
		gender.click();
		
		WebElement signup=driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		signup.click();

	}

}
