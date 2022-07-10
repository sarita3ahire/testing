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

import Automation.ChromeBrowser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import net.bytebuddy.utility.RandomString;

public class KiteLogin {
	WebDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch() throws InterruptedException
	{
		driver= ChromeBrowser.openBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void Test1() throws InterruptedException
	{
		
		ZerodhaLoginPage zlp=new ZerodhaLoginPage(driver);
		zlp.enterusID("OKP335");
		zlp.enterpassword("QAZ123456");
		Thread.sleep(6000);
		zlp.ClickonLogin();
		
		
	
		
		
	}
	@Test
	public void Test2() throws InterruptedException
	{

		ZerodhaLoginPage zlp=new ZerodhaLoginPage(driver);
		zlp.enterusID("OKP335");
		zlp.enterpassword("QAZ123456");
		Thread.sleep(6000);
		zlp.ClickonLogin();
		
		ZerodhaPinPage zp=new ZerodhaPinPage(driver);
		Thread.sleep(3000);
		zp.enterPin("456789");
		zp.ClickOnContinue();
	}
	
	
	@AfterMethod
	public void TakeScreenShot() throws IOException, InterruptedException
	{
//		Step1
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//for take multiple/random Screenshots
			String str=RandomString.make(5);
			
			//Step 2
			File destination=new File("C:\\Users\\ashok\\OneDrive\\Pictures\\AutoSS\\kite"+str+".jpeg");
			
			//Step3
			FileHandler.copy(source, destination);
			Thread.sleep(7000);
			driver.close();

	}
	
	
	

	
}
