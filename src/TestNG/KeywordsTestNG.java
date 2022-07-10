package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.ChromeBrowser;
import POM.FBLoginPage;

public class KeywordsTestNG {
	WebDriver driver;
	@BeforeMethod   // execute before every test case but written only once
	public void LaunchBrowser() throws InterruptedException
	{
		driver= ChromeBrowser.openBrowser("https://www.facebook.com/");
		
	}
	
	@Test(invocationCount=2)//execute tis single test case 2 time 
    public void loginTest() throws InterruptedException 
    {
		
    	FBLoginPage fbp=new FBLoginPage(driver);
    	fbp.enterus("ahire.sarita1@gmail.com");
    	fbp.enterpass("Rits@123");
    	fbp.Clicklogin();
    }

	@Test(priority=2,timeOut=2000)//this test case exceute at second number
    public void LoginwithUserOnly() throws InterruptedException
    {
		Thread.sleep(4000);
    	FBLoginPage fbp=new FBLoginPage(driver);
    	fbp.enterus("ahire.sarita1@gmail.com");
    	fbp.Clicklogin();
    }
	@Test(enabled=false)//stop this testcase
    public void StopTest() throws InterruptedException 
    {
		
    	FBLoginPage fbp=new FBLoginPage(driver);
    	fbp.enterpass("Rits@123");
    	fbp.Clicklogin();
    }
	@Test(priority=1,dependsOnMethods= {"loginTest"})//this test case exceute at second number
    public void LoginRegUserOnly() throws InterruptedException
    {
		Thread.sleep(4000);
    	FBLoginPage fbp=new FBLoginPage(driver);
    	fbp.enterus("");
    	fbp.enterpass("");
    	fbp.Clicklogin();
    }
	
}
