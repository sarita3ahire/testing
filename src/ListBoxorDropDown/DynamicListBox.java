package ListBoxorDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DynamicListBox {

	public static void main(String[] args) throws InterruptedException {
		//EdgeOptions o=new EdgeOptions();
		//o.addArguments("disable notifications");
		System.setProperty("webdriver.edge.driver", "G:\\selenium tool\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://www.spicejet.com");
		
		WebElement from=driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"));
		from.click();
		
		WebElement ajmer=driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'])[3]"));
		ajmer.click();
		
		WebElement ahemdabad=driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 r-cqee49 r-ubezar r-1kfrs79\"])[2]"));
		ahemdabad.click();
		WebElement closeCalender=driver.findElement(By.xpath(""));
		 closeCalender.click();
		Thread.sleep(2000);
		
		WebElement adult=driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 css-bfa6kz r-homxoj r-ubezar\"])[3]"));
		adult.click();
		

	}

}
