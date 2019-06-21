package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.Iterator;
import java.util.Set;
import automation.getpageobjects.GetPage;
import automation.utils.SeleniumWait;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GoogleLogin extends GetPage {

	WebDriver driver;
	private String testname;

	public GoogleLogin(WebDriver driver) {
		super(driver, "GoogleLoginPage");
		this.driver = driver;
	}

	public void Googlelogincheck() {
		element("LoginButton").click();
		msg.log("Login button is displaying");
		wait.hardWait(5);
		element("GoogleButton").click();
		msg.log("Google button is clicked");
		wait.hardWait(5);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowId = it.next();
		SeleniumWait wait = new SeleniumWait(driver, 20);
		String ChildWindowId = it.next();
		driver.switchTo().window(ChildWindowId);
		wait.getWhenVisible(By.id("identifierId"));
		// Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("identifierId")).sendKeys("testvmocktyagi@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		wait.getWhenVisible(By.name("password"));
		// Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Tyagi1991_@");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		wait.getWhenVisible(By.xpath("//span[text()='Allow']"));
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Allow']")).click();
       msg.log("G+ Login done");
		driver.switchTo().window(parentWindowId);
		wait.waitForPageToLoadCompletely();
		verifyElementText("MyAccount", "MY ACCOUNT");
		
		
	}


	public void verifyUserLoggedOutSuccessfully() {
		wait.waitForPageToLoadCompletely();
		Assert.assertTrue(isElementDisplayed("signinbtn"));
	}
	

	


}
