package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import CRUD.TestBase;

public class welcomePage extends TestBase {
	
	//OR
	
	@FindBy (xpath = "//h1[(text()=\"Welcome to Address Book\")]")
	WebElement welcomePageHeaderElement;
	
	@FindBy (xpath = "//h4[text()]")
	WebElement welcomePageDescriptionElement;
	
	@FindBy (xpath = "//a[@id= \"sign-in\"]")
	WebElement signInLink;
	
	@FindBy (xpath = "//a[@class= \"nav-item nav-link active\"]")
	WebElement homeLink;
	
	
	
	
	public welcomePage()
	{
		PageFactory.initElements(driver, this);
		
	}

	
	public String verifyWelcomePageTitle()
	{
		String welcomePageTitle = driver.getTitle();
		
		return welcomePageTitle;
		
		
	}
	
	
	public String verifyWelcomePageHeader()
	{
	    
		return welcomePageHeaderElement.getText();
		
		
	}
	
	

	public String verifyWelcomePageDescription()
	{
	    
		return welcomePageDescriptionElement.getText();
	}
	
	public boolean verifySignInLinkPresentInWelcomePage()
	{
		
	 if (signInLink.isDisplayed() && signInLink.isEnabled())
		 return true;
	 
	 else return false;
		
	}
	
	public boolean verifyHomeLinkPresentInWelcomePage()
	{
		
		 if (homeLink.isDisplayed() && homeLink.isEnabled())
			 return true;
		 
		 else return false;
		
		
	}
	
	public loginPage clickOnSignInPageLink()
	{
		
	    signInLink.click();
		return new loginPage();
		
		
	}
	
	public homePage clickOnHomePageLink()
	{
		homeLink.click();
		return new homePage();
		
	}
		
		
	
}
