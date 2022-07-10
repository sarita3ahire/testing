package ListBoxorDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListBoxSingleorMultipleSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "G:\\selenium tool\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();//upcasting to complete the WEbDriver i/f
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement createnewacc=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createnewacc.click();
		Thread.sleep(2000);
		//TC - verify the listbox is multiselectable or not
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		Boolean result=s.isMultiple();
		
		if(result==true)
		{
			System.out.println("Test is Passed : listbox is Multiselectable");
		}
		else
		{
			System.out.println("Test is false: list is single selectable");
		}

	}

}
