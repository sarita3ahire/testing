package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FBCreateNewAcc {
	@FindBy (xpath= "//a[text()='Create New Account']") private WebElement CreatenewAcc;
	
	@FindBy (xpath = "//input[@name='firstname']") private WebElement fstname;
	@FindBy (xpath = "//input[@name='lastname']") private WebElement lstname;
	@FindBy (xpath = "//input[@name='reg_email__']") private WebElement email;
	@FindBy (xpath= "//input[@name='reg_email_confirmation__']") private WebElement reemail;
	@FindBy (xpath = "//input[@name='reg_passwd__']") private WebElement pass;
	@FindBy (xpath ="(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]") private WebElement day;
    @FindBy (xpath ="(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]") private WebElement month;
    @FindBy (xpath = "(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]") private WebElement year;
    @FindBy (xpath ="//input[@class='_8esa']") private WebElement gender;
    @FindBy (xpath ="//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']") private WebElement signup;

public FBCreateNewAcc(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void ClickonCreateNewaccount() throws InterruptedException
{
	CreatenewAcc.click();
	Thread.sleep(2000);
}

public void enter1stname(String firstanme) throws InterruptedException
{
	
	fstname.sendKeys(firstanme);
}
public void enterlastname(String lastname)
{
	lstname.sendKeys(lastname);
}
public void enteremailID(String emailID)
{
	email.sendKeys(emailID);
}
public void enterremailID(String repeatemail)
{
	reemail.sendKeys(repeatemail);
}
public void enterpass(String password)
{
	pass.sendKeys(password);
}
public void selectday()
{
	Select s=new Select(day);
	s.selectByIndex(2);
	
}
public void selectMonth()
{
	Select s1=new Select(month);
	s1.selectByIndex(5);
}
public void selectyear()
{
	Select s2=new Select(year);
	s2.selectByValue("1995");
}
public void Clickongender()
{
	gender.click();
}
public void ClickonSignup()
{
	signup.click();
}
}