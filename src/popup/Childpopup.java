package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/popups#");
		driver.manage().window().maximize();
		WebElement window=driver.findElement(By.xpath("//input[@onclick='openWindows()']"));
		window.click();
		//handle of homepage
		String parentid=driver.getWindowHandle();
		
		//handle of all child pages as well as parent
	Set<String> allpageids	=driver.getWindowHandles();
	System.out.println(allpageids.size());
	
	for(String s:allpageids)//using forEach loop
	{
		//System.out.println(allpageids);
		if(!s.equals(parentid))
		{
			String actualTitle=driver.switchTo().window(s).getTitle();
		System.out.println(actualTitle);
			if(actualTitle.contains("Yahoo Search"))
			{
            WebElement search=driver.findElement(By.xpath("//input[@id='yschsp']"));
            search.sendKeys("redmi");
		
	}
	
		}
	}
	

	}

}
