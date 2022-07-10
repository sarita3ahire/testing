package ListBoxorDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectableListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "G:\\selenium tool\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("file:///C:/Users/ashok/OneDrive/Attachments/Desktop/demo.html");
		
		WebElement multi=driver.findElement(By.xpath("//select[@multiple='true']"));
		//verify the list is multiselectable
		Select s=new Select(multi);
		
	   Boolean result=	s.isMultiple();
	   if(result==true)
	   {
		   System.out.println("test is passed: list is multiselectable");
	   }
	   else
	   {
		   System.out.println("Test is Failed: list is single Selectable");
	   }
	   //select multiple options from listbox
	   s.selectByIndex(0);
	   s.selectByVisibleText("travelling");
	   s.selectByVisibleText("writting");
	    Thread.sleep(2000);
	    //remove particular option from selected list
	   s.deselectByIndex(0);
	   Thread.sleep(2000);
	   //remove all optons from selected listbox
	  // s.deselectAll();
	   
	   //get all options on console
	   List<WebElement> hobbieslist=s.getOptions(); //store all hobbies
	   System.out.println("List of Hobbies :");
	   for(WebElement e:hobbieslist)
	   {
		   System.out.println(e.getText());
	   }
	  //TC- Verify which values/options selected or
	   //validate correct options are selected or not
	   //validate given input is selected from listbox or not
	   List<WebElement> hobbies=s.getAllSelectedOptions(); //getText() method not availale
       for(WebElement h: hobbies)
       {
    	   System.out.println(h.getText());
    	   
       }
	}

}
