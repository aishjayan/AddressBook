package CRUDTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CRUD.TestBase;

public class LoginPageTest extends TestBase{
	
	public LoginPageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	
	{
		
		initialize();
			
		
	}
	
	@Test
	public void testcase1()
	{
		
		System.out.print("Test case executed");
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}

}
