package mouse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Double_Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act=new Actions(driver);
		
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rightclick);
		act.perform();
		
		WebElement edit=driver.findElement(By.xpath("//span[text()='Edit']"));
		edit.click();
		Alert a=driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(4000);
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleclick);
		act.perform();
		//a.accept();
		System.out.println(a.getText()); 
		
		
		

	}

}
