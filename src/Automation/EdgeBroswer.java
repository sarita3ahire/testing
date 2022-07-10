package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBroswer {

	public static WebDriver OpenEdge(String url) {
		System.setProperty("webdriver.edge.driver", "G:\\selenium tool\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//driver.get("https://www.flipkart.com");
		driver.get(url);
		driver.manage().window().maximize();
		return driver;

	}

}
