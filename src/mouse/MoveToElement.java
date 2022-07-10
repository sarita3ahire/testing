package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
        WebElement signin=driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
        Actions act=new Actions(driver);
        act.moveToElement(signin);
        act.perform();
        
        WebElement youracc=driver.findElement(By.xpath("//span[text()='Your Account']"));
        youracc.click();
        
        driver.navigate().back();
        
        WebElement prime=driver.findElement(By.xpath("//span[text()='Prime']"));
        act.moveToElement(prime);
        act.perform();*/
		
		driver.get("https://www.flipkart.com");
		
		WebElement closeloginpopup=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeloginpopup.click();
		
		
		WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a=new Actions(driver);
		a.moveToElement(login).perform();
		
		WebElement giftCard=driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		giftCard.click();
	}

}
