package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameinsideFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		
		driver.switchTo().frame("frame1");
		
		driver.switchTo().frame("frame3");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
		checkbox.click();
		
		driver.switchTo().parentFrame();
		WebElement Topic=driver.findElement(By.xpath("(//input)[1]"));
		Topic.sendKeys("sarita");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(animals);
		s.selectByVisibleText("Avatar");
		

	}

}
