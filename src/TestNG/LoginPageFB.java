package TestNG;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.*;
import POM.*;
import net.bytebuddy.utility.RandomString;
public class LoginPageFB {
	WebDriver driver;
	@BeforeMethod   // execute before every test case but written only once
	public void LaunchBrowser() throws InterruptedException
	{
		driver= ChromeBrowser.openBrowser("https://www.facebook.com/");
		
	}
	
	@Test(enabled=false)//stop execution  by enabled=false
    public void loginTest() throws InterruptedException 
    {
		
    	FBLoginPage fbp=new FBLoginPage(driver);
    	fbp.enterus("ahire.sarita1@gmail.com");
    	fbp.enterpass("Rits@123");
    	fbp.Clicklogin();
    }

	@Test
    public void LoginRegUserOnly() throws InterruptedException
    {
		Thread.sleep(4000);
    	FBLoginPage fbp=new FBLoginPage(driver);
    	fbp.enterus("ahire.sarita1@gmail.com");
    	fbp.Clicklogin();
    }
	
	@AfterMethod
	public void TakeScreenShot() throws IOException
	{
//		Step1
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//for take multiple/random Screenshots
			String str=RandomString.make(5);
			
			//Step 2
			File destination=new File("C:\\Users\\ashok\\OneDrive\\Pictures\\AutoSS\\fb"+str+".jpeg");
			
			//Step3
			FileHandler.copy(source, destination);
			
			driver.close();

	}
}
