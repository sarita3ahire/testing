package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {
	//Encapsulation and abstraction - all data members restricted /declared as private
	//@FindBy is annotation of selenium and used to finds elements on webpage
	//POM finds elemts only 1 time and reflects everywhere
	@FindBy (xpath= "//input[@id='email']") private WebElement username;
	@FindBy (xpath= "//input[@id='pass']") private WebElement password;
	@FindBy (xpath= "//button[@name='login']") private WebElement login;
	@FindBy (xpath= "//a[text()='Forgotten password?']") private WebElement forgotpass;
	@FindBy (xpath= "//a[@data-testid='open-registration-form-button']") private WebElement CreatenewAcc;
	
	//constructor always public
	public FBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//this use to find only current class elements 
	}
	//methods are always public
	public void enterus(String email)
	{
		username.sendKeys(email);
	}
	public void enterpass(String pass)
	{
		password.sendKeys(pass);
	}
	public void Clicklogin()
	{
		login.click();
	}
	public void ClickonForgetpassword()
	{
		forgotpass.click();
	}
	public void ClickonCreateNewaccount()
	{
		CreatenewAcc.click();
	}

}
