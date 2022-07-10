package Automation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChildBrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ChromeBrowser.openBrowser("https://vctcpune.com/");
		WebElement ssprac=driver.findElement(By.xpath("(//a[@href='../selenium/practice.html'])[1]"));
		ssprac.click();
		ssprac.click();
		//using SET
	/*	Set<String> handles=driver.getWindowHandles();//get address / all handles
		
		Iterator<String> i=handles.iterator();
		/*String a=i.next();
		System.out.println(a);
		String b=i.next();
		System.out.println(b);
		
		//how to switch on diff tabs
		driver.switchTo().window(b);
		
		//get title of current tab/page
		String currentpagetitle=driver.getTitle();
		System.out.println(currentpagetitle);
		
		//perform operation on currentpage
		if(currentpagetitle.equals("Practice Page"))
		{
			WebElement dd=driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
			Select s=new Select(dd);
			s.selectByValue("option2");
		}*/
		
		// or using hasNext() 
		/*while(i.hasNext()) //visit every window one by one
		{
			String h=i.next();
			driver.switchTo().window(h);
			String currentpagetitle=driver.getTitle();
			System.out.println(currentpagetitle);
			if(currentpagetitle.equals("Practice Page"))
			{
				WebElement dd=driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
				Select s=new Select(dd);
				s.selectByValue("option2");
				
				WebElement rb=driver.findElement(By.xpath("//input[@value='Radio2']"));
				rb.click();
				boolean rb2=rb.isSelected();
				System.out.println("redio buttom is selected? "+rb2);
				
				WebElement country=driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"));
				country.sendKeys("India");
				
				WebElement home=driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
				home.click();
				
				WebElement redlink=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/article/div/div/div/div[1]/div/div/marquee"));
				String p=redlink.getText();
				System.out.println(p);
			}
			}
		}*/
		
		//using ArrayList Collection
		
		//step 1: create object and in constructor ,pass getWindowHandles() as arg
		ArrayList<String> al=new ArrayList(driver.getWindowHandles());
		//step 2:we can check size of arraylist
		int size=al.size();
		System.out.println(size);
		//step 3:get address/handles of tabs
		//String handles=al.get(0);
		//or get handles and switch on diff tabs
		driver.switchTo().window(al.get(2));
		System.out.println(driver.getTitle());
		WebElement home=driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		home.click();
		//zero index is always home page
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		WebElement redlink=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/article/div/div/div/div[1]/div/div/marquee"));
		System.out.println(redlink.getText());   
	
		//1st index is always last page
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		WebElement country=driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"));
		country.sendKeys("India");
		
		
		

	}

	
	}


