package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ChromeBrowser;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("courses-iframe");
		//driver.switchTo().frame(0);
		
	WebElement course=driver.findElement(By.xpath("(//a[@href='https://vctcpune.com/courses/'])[1]"));
		course.click();

	}

}
