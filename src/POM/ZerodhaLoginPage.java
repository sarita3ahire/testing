package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	@FindBy (xpath = "//input[@id='userid']") private WebElement userId;
	@FindBy (xpath = "//input[@placeholder='Password']") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement login;
	@FindBy (xpath = "//a[text()='Forgot user ID or password?']") private WebElement ForgotUSPass;
	

	public ZerodhaLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterusID(String userid)
	{
		userId.sendKeys(userid);
	}
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void ClickonLogin()
	{
		login.click();
	}
	public void ClickonForgetUSPS()
	{
		ForgotUSPass.click();
	}
	
	

}
