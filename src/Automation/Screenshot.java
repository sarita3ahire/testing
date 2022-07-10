package Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=ChromeBrowser.openBrowser("https://www.gmail.com/");
	//	Step1
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//for take multiple/random Screenshots
		String str=RandomString.make(5);
		
		//Step 2
		File destination=new File("C:\\Users\\ashok\\OneDrive\\Pictures\\AutoSS\\gmail"+str+".jpeg");
		
		//Step3
		FileHandler.copy(source, destination);

	}

}
