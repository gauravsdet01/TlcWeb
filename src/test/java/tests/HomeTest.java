package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.session.SeleniumSession;
import automation.utils.YamlReader;

public class HomeTest {
	SeleniumSession test;

	@BeforeClass
	public void Step00_OpenBrowserWindow() {
		test = new SeleniumSession(this.getClass().getSimpleName());
		test.launchApplication();
		test.loginPage.login(YamlReader.getData("enterEmail"), YamlReader.getData("password"));
	}

	@Test(priority = 1)
	public void Step01Homeverify() {
//		test.networkFeedbackPage.navigateToDashboardPage();
		test.HomePage.Ishomepage();

	}

	
	  @Test(priority = 2)
	  public void Step02WishlistMoveItem() {
		  test.HomePage.MoveItemTOWishlist();
	  
	  } 
	  
	  @Test(priority=3)
	  public void Step03BrandSearch() { 
		  test.HomePage.SearchByBrand();
	  
	  }
	  
	  @Test(priority=3)
	  public void Step04ColorSearch() { 
		  test.HomePage.SearchByColor();
	  
	 }
	 
	  
	 

	@AfterMethod
	public void take_screenshot_on_failure(ITestResult result) {
		test.takescreenshot.takeScreenShotOnException(result);
	}

	@AfterClass(alwaysRun = true)
	public void Close_Test_Session() {
		test.closeBrowserSession();
	}

}
