package Automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowser {

	//public static void main(String[] args) {
	 public static WebDriver openBrowser(String url) throws InterruptedException//used return type Webdriver for call navigate().to() method and call in another method
	 {
		 
		System.setProperty("webdriver.chrome.driver", "G:\\selenium tool\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
      // driver.get("https://www.flipkart.com/");
       // driver.get(url);//get webpage at runtime
        driver.navigate().to(url);  //navigate is a method of webdriver which returns complete navigation i/f then we use methods of this i/f to perform diff actions
driver.manage().window().maximize();
        return driver; //for result used in another method
		
	}

	
}
