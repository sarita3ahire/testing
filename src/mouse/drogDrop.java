package mouse;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drogDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		List<WebElement> list=driver.findElements(By.xpath("//a[@class='button button-orange']"));
		WebElement source=list.get(4);
		Thread.sleep(2000);
		//WebElement desti=driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
		WebElement desti=driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
		
		//step2
		Actions a=new Actions(driver);
		//step3
		a.dragAndDrop(source, desti);
		a.perform();

	}

}
