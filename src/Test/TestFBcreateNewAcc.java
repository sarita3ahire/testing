package Test;
import POM.*;
import org.openqa.selenium.WebDriver;

import Automation.*;

public class TestFBcreateNewAcc {

	public void NewUser() throws InterruptedException
	{
		WebDriver driver=ChromeBrowser.openBrowser("https://www.facebook.com/");
		driver.manage().window().maximize();
		FBCreateNewAcc ca=new FBCreateNewAcc(driver);
		
		ca.ClickonCreateNewaccount();
		
		Thread.sleep(2000);
		
		ca.enter1stname("Sarita");
		ca.enterlastname("Ahire");
		ca.enteremailID("ahire.sarita1@gmail.com");
		ca.enterremailID("ahire.sarita1@gmail.com");
		ca.enterpass("sarita3ahire");
		
		Thread.sleep(3000);
		ca.selectday();
		ca.selectMonth();
		ca.selectyear();
		ca.Clickongender();
		ca.ClickonSignup();
		
	}
	public static void main(String[] args) throws InterruptedException {
		TestFBcreateNewAcc t=new TestFBcreateNewAcc();
		t.NewUser();

	}

}
