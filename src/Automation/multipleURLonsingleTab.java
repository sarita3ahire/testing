package Automation;

import org.openqa.selenium.WebDriver;

public class multipleURLonsingleTab {

	public static void main(String[] args) {
		WebDriver driver=EdgeBroswer.OpenEdge("https://www.flipkart.com");
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.get("www.gmail.com");

	}

}
