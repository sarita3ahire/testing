package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingSetIterator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/popups#");
		driver.manage().window().maximize();
		WebElement window=driver.findElement(By.xpath("//input[@onclick='openWindows()']"));
		window.click();
		
		//String parentid=driver.getWindowHandle();
		
	Set<String> allpageids	=driver.getWindowHandles();
	Iterator<String> i=allpageids.iterator();
	
	while(i.hasNext()) //visit every window one by one
	{
		String child=i.next();
		//switch on different tabs
		String actualTitle=driver.switchTo().window(child).getTitle(); //or driver.getTitle() seperatly
		System.out.println(actualTitle);
		if(actualTitle.contains("Yahoo Search")) //or if(actualTitle.equals("Yahoo Search - Web Search "))
		{
			 WebElement search=driver.findElement(By.xpath("//input[@id='yschsp']"));
	            search.sendKeys("redmi");
		}
		
	}

	}

}
