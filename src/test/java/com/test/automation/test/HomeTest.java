package com.test.automation.test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.automation.configuration.Configuration;
import com.test.automation.dataproviders.HomeDataProvider;
import com.test.automation.pageobjects.HomePage;
import com.test.automation.providers.WebdriverProvider;
import com.test.automation.utils.Utils;

public class HomeTest {

	/**
	 * Validate home page test.
	 *
	 * @param url the url
	 * @throws Exception the exception
	 */
	@Test(dataProvider="HomepageDataProvider",dataProviderClass=HomeDataProvider.class)
	public void validateHomePageTest(String url) throws Exception
	{
		SoftAssert sa=new SoftAssert();
		WebDriver driver=WebdriverProvider.getDriver();
		driver.get(url);
		System.out.println("Browser title after entering the url is "+driver.getTitle());
		sa.assertEquals(driver.getTitle(), Configuration.getConfig().getConfigProperty("HOMEPAGE_TITLE"), "Home page Title is not correct");
		
		HomePage.getHome().getSearchBoxTextField().sendKeys(Configuration.getConfig().getConfigProperty("HOME_SEARCH_ADDRESS"));
		HomePage.getHome().clickSearchBoxButton();
		Thread.sleep(5000);
		System.out.println("Browser title in SRP page "+driver.getTitle());
		sa.assertEquals(driver.getTitle(), Configuration.getConfig().getConfigProperty("SRP_PAGE_TITLE"), "SRP Title is not correct");
		sa.assertAll();
		driver.quit();
	
		
		/*Home homePage=new Home(driver);
		Home homePage=PageFactory.initElements(driver, Home.class);
		homePage.getSearchBoxTextField().sendKeys("abc");
		driver.findElement(By.xpath("//input[@id= 'searchBox']")).sendKeys("abc");
		HomePage.getHome().getSearchBoxTextField().sendKeys("Binder");*/
		/*		String baseUrl=Configuration.getConfig().getConfigProperty("BASE_URL");
		String browserName=Configuration.getConfig().getConfigProperty("BROWSER_NAME");
		String homeaddress=Configuration.getConfig().getConfigProperty("HOME_SEARCH_ADDRESS");
		System.out.println("Base url is " + baseUrl);
		System.out.println("Browser name is " + browserName);
		System.out.println("Browser name is " + homeaddress);
		*/
		
	}
	
}
