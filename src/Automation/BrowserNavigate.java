package Automation;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class BrowserNavigate {

	public static void main(String[] args) throws InterruptedException {
		//Browser.openBrowser("https://www.bankofbaroda.in/career/current-opportunities");//call parameterized static method
		WebDriver driver=ChromeBrowser.openBrowser("https://www.gmail.com/");//used for result of return type webdriver driver
		//driver.close();// close the browser
		//WebDriver driver1=Browser.openBrowser("https://www.google.com/");
	//  driver1.close();

	String title=	driver.getTitle();
	//String title1=	driver1.getTitle();
		System.out.println("Title of current webpage is \n "+title);
		
		String url=driver.getCurrentUrl();
	//  String url1=driver1.getCurrentUrl();
	  System.out.println("Current webpage url is \n"+url);
	  
	  
	/*  Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);//throws exception
	  */
	  //manage() is the method of Webdriver which returns complete i/f of Options
	 // window() is the method of options i/f which returens window i/f
	  //maximize() and minimize() are the methods of window i/f
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.manage().window().minimize();
	  
	  Dimension d=new Dimension(300,700);
	  driver.manage().window().setSize(d);
	  
	  Point p=new Point(100,100);
	  driver.manage().window().setPosition(p);

	}

}
