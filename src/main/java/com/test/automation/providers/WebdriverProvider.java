package com.test.automation.providers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.test.automation.configuration.Configuration;
import com.test.automation.listeners.WebEventListeners;

/**
 * The Class WebdriverProvider.
 */
public class WebdriverProvider {

	public static WebDriver driver;
	public static EventFiringWebDriver efdriver;
	public static WebEventListeners eventListener;
	public static String browserName=Configuration.getConfig().getConfigProperty("BROWSER_NAME");
	/**
	 * This method return the driver instance
	 * @return driver object
	 */

	/**
	 * This method initialise the driver and return the driver instance.
	 *
	 * @return the driver
	 */
	public static WebDriver getDriver()
	{

		if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Configuration.getConfig().getConfigProperty("CHROME_DRIVER_PATH"));
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",Configuration.getConfig().getConfigProperty("IE_DRIVER_PATH"));
			driver=new InternetExplorerDriver();
		}
		
		efdriver= new EventFiringWebDriver(driver);
		eventListener=new WebEventListeners();
		efdriver.register(eventListener);
		driver=efdriver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	/**
	 * This method close the browser
	 */
	public static void closeBrowser()
	{
		driver.quit();
	}
}

