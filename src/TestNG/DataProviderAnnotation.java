package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	
	@DataProvider(name = "TestData")
	public Object[][] addTestdata()

	{
		return new Object[][] {{2,3},{10,20}};
		
	}
	@Test(dataProvider= "Addition")
	public void additiontest(int a,int b)
	{
		System.out.println(a+b);
	}
	@Test(dataProvider="TestData")
	public void MulTest(int a, int b)
	{
		System.out.println(a*b);
	}
	

}
