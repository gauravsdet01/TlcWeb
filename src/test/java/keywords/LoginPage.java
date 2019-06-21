package keywords;

import org.openqa.selenium.WebDriver;

import automation.getpageobjects.GetPage;

import junit.framework.Assert;

public class LoginPage extends GetPage {

	WebDriver driver;
	private String testname;

	public LoginPage(WebDriver driver) {
		super(driver, "LoginPage");
		this.driver = driver;
	}

	public void enterUserName(String enterEmail) {
		isElementDisplayed("LoginButton");
		element("LoginButton").click();
		//element("enterEmail").clear();
		wait.hardWait(2);
		element("enterEmail").sendKeys(enterEmail);
		msg.log("Send email as " + enterEmail);
	}

	void enterPassword(String password) {
		isElementDisplayed("password");
		element("password").clear();
		element("password").sendKeys(password);
		msg.log("enter password as Suspense");
	}

	void clickOnContinueWithEmail() {
		isElementDisplayed("continueWithEmail");
		element("continueWithEmail").click();
		msg.log("Click on continue with Email button !!");
	}
	
	void clickOnLogin() {
		isElementDisplayed("LoginEnter");
		element("LoginEnter").click();
		msg.log("Click on Login button !!");
	}

	void clickOnGivenPanel(String panelName) {
		isElementDisplayed("lnk_sidePanel", panelName);
		element("lnk_sidePanel", panelName).click();
		msg.log("Click On Panel " + panelName);
		wait.hardWait(1);
	}
	
	public boolean IsGivenPanelDisplay(String panelName)
	 {
	  return  isElementDisplayed("loginSuccess", panelName);
	 }

	public void login(String enterEmail, String password) {
		wait.hardWait(2);
//		clickOnGivenPanel("Login Panel");
		enterUserName(enterEmail);
		//clickOnContinueWithEmail();
		wait.hardWait(2);
		enterPassword(password);
		wait.hardWait(2);
		clickOnLogin();
//		acceptAlert();
//		handleAlert();
		wait.waitForPageToLoadCompletely();
		//wait.waitForElementToBeVisible(element("loginSuccess"));
		wait.hardWait(5);
		System.out.println("Testname" + this.testname);
		
	}
	
	public void verifyUserLoggedOutSuccessfully() {
		wait.waitForPageToLoadCompletely();
		Assert.assertTrue(isElementDisplayed("signinbtn"));
	}
	

	public Boolean isUserOnLoginPage(){
		
		return IsGivenPanelDisplay("Login Panel");
	}


}
