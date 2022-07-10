package ListBoxorDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllOptionsFromListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement createnewacc=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createnewacc.click();
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		month.click();
		Thread.sleep(2000);
		Select s=new Select(month);
	List<WebElement> listofMonths=	s.getOptions(); //store all months into List
	
	for(WebElement l:listofMonths) //visit one by one month using for each loop
	{
		System.out.println(l.getText()); //retrive months on console
	}

	}

}
