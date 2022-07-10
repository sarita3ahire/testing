package ListBoxorDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleSelectableListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "G:\\selenium tool\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement createnewacc=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createnewacc.click();
		
		Thread.sleep(2000);
		//step 1
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		//step2
		Select s=new Select(day);
		//step3
		s.selectByValue("3");
		//s.selectByVisibleText("3");
		//s.selectByIndex(2);
		
		
		//verify correct option is selected/validate given input is selected or not/validate which value is selected from list on console
		String actualresult=s.getFirstSelectedOption().getText();
		String expectedresult="5";
		if(expectedresult.equalsIgnoreCase(actualresult))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is Failed");
		}
		
		

	}

}
