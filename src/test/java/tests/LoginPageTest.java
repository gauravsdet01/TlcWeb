package tests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import automation.session.SeleniumSession;
import automation.utils.YamlReader;

public class LoginPageTest {
	SeleniumSession test;
	@BeforeClass
	public void Step00_OpenBrowserWindow() {
		test = new SeleniumSession(this.getClass().getSimpleName());
		test.launchApplication();
		test.loginPage.login(YamlReader.getData("enterEmail"), YamlReader.getData("password"));
	}
	
   @Test(priority=1)
  public void Step01Email_Login() {
	  System.out.println("passed");
	}
   @Test(priority=2)
   public void Step02Email_Login1() {
 	  System.out.println("passed");
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
