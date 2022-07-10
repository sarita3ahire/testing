package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest   //its run 1st 
	public void Test5()
	{
		System.out.println("Test5");
	}
	@Test //when we write @Test then 
	@Parameters({"a","b"})
	public void test1(int a, int b)
	{
		System.out.println(a*b); //OR a*b
	}
	@Test
	public void Test2()
	{
		System.out.println("test2");
		
	}
	@BeforeClass
	public void test3()//1st run if @Test written before the @BeforeTest//when we write @BeforeTest and @AfterTest then @BeforeClass can not run
	{
		System.out.println("test3");
	}
	//Compulsory run at the end of execution
	@AfterTest
	public void test6()
	{
		System.out.println("run at the end");
	}
	@BeforeMethod
	public void BeforeMethod()//its run before every test case ex:launch browser
	{
		System.out.println("run before every test case");
	}
	@AfterMethod
	public void AfterMethod()//its run after every test case Ex: Screenshot
	{
		System.out.println("run after every test case");
	}
}
