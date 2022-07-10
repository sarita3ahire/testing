package ListBoxorDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class autosuggessionListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "G:\\selenium tool\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        
        WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        search.sendKeys("redmi 7 pro");
        Thread.sleep(2000);
        List<WebElement> redmi1=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
 
        Thread.sleep(2000);
      //step3: visit element one by one if match is there click on that webelement
        String expected="redmi 7 pro";
		for(WebElement s:redmi1)
		{
			String actual=s.getText();
			if(expected.equalsIgnoreCase(actual))
			{
				s.click();
				break;
			}
		}

        
	}

}
