package CRUDTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CRUD.TestBase;
import Pages.homePage;
import Pages.loginPage;
import Pages.welcomePage;

public class welcomePageTest extends TestBase{
	
	welcomePage wp;
	loginPage lp;
	homePage hp;
	
	
	public welcomePageTest()
	{
		
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	
	{
		initialize();
		wp = new welcomePage();
		lp = new loginPage();
		hp = new homePage();
		
	}
	
	
	@Test (enabled = true)
	
	public void welcomePageTitleTest()
	
	{
		Assert.assertEquals(wp.verifyWelcomePageTitle(), "Address Book" , "Title mismatch");
				
		
	}
	
	@Test (enabled = true)
	
	public void welcomePageHeaderTest()
	{
		
		Assert.assertEquals(wp.verifyWelcomePageHeader(),"Welcome to Address Book","Header mismatch");
	}
	
	@Test (enabled = true)
	
	public void welcomePageDescriptionTest()
	{
		
		Assert.assertEquals(wp.verifyWelcomePageDescription(), "A simple web app for showing off your testing" , "Description mismatch");
	}
	
	@Test (enabled = true)
	
	public void welcomePageSignInLinkPresentTest()
	
	{
		
	 Assert.assertTrue(wp.verifySignInLinkPresentInWelcomePage());
		
		
	}
	
	@Test (enabled = true)
	
    public void welcomePageHomePageLinkPresentTest()
	
	{
    	Assert.assertTrue(wp.verifyHomeLinkPresentInWelcomePage());
		
		
	}
	
	@Test (enabled = true)
	
	public void clickSignInLinkOnWelcomePageTest()
	{
		lp = wp.clickOnSignInPageLink();
		
	}
	
	@Test (enabled = true)
		
	public void clickHomePageLinkOnWelcomePageTest()
	{
		
		hp = wp.clickOnHomePageLink();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}

}
