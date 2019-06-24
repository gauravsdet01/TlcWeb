package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.session.SeleniumSession;
import automation.utils.YamlReader;

public class WishListTest {
	SeleniumSession test;

	@BeforeClass
	public void Step00_OpenBrowserWindow() {
		test = new SeleniumSession(this.getClass().getSimpleName());
		test.launchApplication();
		test.loginPage.login(YamlReader.getData("enterEmail"), YamlReader.getData("password"));
	}

  
	  @Test(priority=1)
	  public void Wishlist() { 
		  test.launchApplication("https://theluxurycloset.com/my-account/my-wishlist");
		  test.HomePage.SearchByBrand();
	  
	  }
	  
	/*
	 * @Test(priority=3) public void Step04ColorSearch() {
	 * test.HomePage.SearchByColor();
	 * 
	 * }
	 */
	 
	  
	 

	@AfterMethod
	public void take_screenshot_on_failure(ITestResult result) {
		test.takescreenshot.takeScreenShotOnException(result);
	}

	@AfterClass(alwaysRun = true)
	public void Close_Test_Session() {
		test.closeBrowserSession();
	}

}
