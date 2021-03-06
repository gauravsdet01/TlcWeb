/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package automation.session;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {

	private static String browser;
	private static final DesiredCapabilities capabilities = new DesiredCapabilities();

	public WebDriver getDriver(Map<String, String> seleniumconfig) {
		browser = seleniumconfig.get("browser");

		if (seleniumconfig.get("seleniumserver").equalsIgnoreCase("local")) {
			if (browser.equalsIgnoreCase("firefox")) {
				return getFirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				return getChromeDriver(seleniumconfig.get("driverpathchrome"));
			} else if (browser.equalsIgnoreCase("Safari")) {
				return getSafariDriver();
			} else if ((browser.equalsIgnoreCase("ie"))
					|| (browser.equalsIgnoreCase("internetexplorer"))
					|| (browser.equalsIgnoreCase("internet explorer"))) {
				return getInternetExplorerDriver(seleniumconfig
						.get("driverpathie"));
			}
		}
		if (seleniumconfig.get("seleniumserver").equalsIgnoreCase("remote")) {
			return setRemoteDriver(seleniumconfig);
		}
		return new FirefoxDriver();
	}
	
	
	private WebDriver setRemoteDriver(Map<String, String> selConfig) {
		DesiredCapabilities cap = null;
		browser = selConfig.get("browser");
		if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("tara-----" + browser);
			cap = DesiredCapabilities.firefox();
		} else if (browser.equalsIgnoreCase("chrome")) {
			cap = DesiredCapabilities.chrome();
		} else if (browser.equalsIgnoreCase("Safari")) {
			cap = DesiredCapabilities.safari();
		} else if ((browser.equalsIgnoreCase("ie"))
				|| (browser.equalsIgnoreCase("internetexplorer"))
				|| (browser.equalsIgnoreCase("internet explorer"))) {
			cap = DesiredCapabilities.internetExplorer();
		}
		String seleniuhubaddress = selConfig.get("seleniumserverhost");
		URL selserverhost = null;
		try {
			selserverhost = new URL(seleniuhubaddress);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		cap.setJavascriptEnabled(true);
		 RemoteWebDriver driver =new RemoteWebDriver(selserverhost, cap);
		driver.setFileDetector(new LocalFileDetector());
		return driver;
	}

	private static WebDriver getChromeDriver(String driverpath) {
		//System.setProperty("webdriver.chrome.driver", driverpath);
		//ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    	//System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaura\\git\\repository2\\WebdriverTest\\Driver\\chromedriver.exe");
    	//driver = new ChromeDriver();
    	ChromeOptions options = new ChromeOptions();  
    	options.addArguments("--headless", "--disable-gpu", "--ignore-certificate-errors");
    	
    	//driver = new FirefoxDriver();
		return new ChromeDriver(options);
	}

	private static WebDriver getInternetExplorerDriver(String driverpath) {
		System.setProperty("webdriver.ie.driver", driverpath);
		capabilities.setCapability("ignoreZoomSetting", true);
		return new InternetExplorerDriver(capabilities);
	}

	private static WebDriver getSafariDriver() {
		capabilities.setJavascriptEnabled(true);
		return new SafariDriver();
	}

	private static WebDriver getFirefoxDriver() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.cache.disk.enable", false);
		profile.setPreference("marionette", false);
		if (System.getProperty("os.name").contains("Windows")) {
			System.setProperty("webdriver.gecko.driver",
					"./src/test/resources/Drivers/geckodriver.exe");
		} else {
			System.setProperty("webdriver.gecko.driver",
					"./Drivers/geckodriver");
		}
		return new FirefoxDriver(profile);
	}
}
