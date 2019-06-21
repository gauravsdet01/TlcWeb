package keywords;

import org.openqa.selenium.WebDriver;
import java.util.Iterator;
import java.util.Set;
import automation.getpageobjects.GetPage;
import org.openqa.selenium.By;
import junit.framework.Assert;

public class FacebookLogin extends GetPage {

	WebDriver driver;

	public FacebookLogin(WebDriver driver) {
		super(driver, "FacebookPage");
		this.driver = driver;
	}


	
	public void fblogin() throws InterruptedException {
		element("LoginButton").click();
		msg.log("Login button is displaying");
		wait.hardWait(2);
		driver.findElement(By.xpath("//div[contains(text(),'Login with Facebook')]")).click();
		// driver.findElement(By.xpath(".//*[@id='authentication-login']/div/section[1]/div[3]/div/button[1]")).click();
		  String parentWindow = driver.getWindowHandle();     
		  System.out.println("Parent Window ID is : " + parentWindow);

		  Set<String> allWindow = driver.getWindowHandles();

		  int count = allWindow.size();
		  System.out.println("Total Window : " + count);

		  for(String child:allWindow)
		  {
		      if(!parentWindow.equalsIgnoreCase(child))
		      {
		          driver.switchTo().window(child);
		          driver.manage().window().maximize();
		          driver.findElement(By.id("email")).sendKeys("gauravtmca@gmail.com");
		          driver.findElement(By.id("pass")).sendKeys("Neha@9719");
		          driver.findElement(By.id("u_0_0")).click();
		          Thread.sleep(7000);
		       }
		  }
		  driver.switchTo().window(parentWindow); 
		  wait.waitForPageToLoadCompletely();
		  wait.hardWait(5);
			verifyElementText("MyAccount", "MY ACCOUNT");
	}
	



}
