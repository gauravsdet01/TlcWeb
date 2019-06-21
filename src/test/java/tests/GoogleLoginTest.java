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

public class GoogleLoginTest {
	SeleniumSession test;
	@BeforeClass
	public void Step00_OpenBrowserWindow() {
		test = new SeleniumSession(this.getClass().getSimpleName());
		test.launchApplication();
			}
  @Test
public void Email_Login() {
	  test.GoogleLoginPage.Googlelogincheck();

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
