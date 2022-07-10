package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage {
	@FindBy (xpath ="//input[@type='password']") private WebElement pin123;
	@FindBy (xpath = "//button[@type='submit']") private WebElement continu;
	@FindBy (xpath ="//a[@href='/forgot']") private WebElement forget2f;
	
	
	
	public ZerodhaPinPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}


	public void enterPin(String pin1)
    {
    	pin123.sendKeys(pin1);
    }
    public void ClickOnContinue()
    {
    	continu.click();
    }


	
	
	

}
