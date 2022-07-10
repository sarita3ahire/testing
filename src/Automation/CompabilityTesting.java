package Automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CompabilityTesting {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "G:\\selenium tool\\edgedriver_win64\\msedgedriver.exe");
		
		
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter chrome for open chrome browser or enter edge for Edge browser");
    	String choice=s.nextLine();
    	
		//String choice="Edge";
		if(choice.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(choice.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("https://www.flipkart.com");
		
		
	}

}
