package com.test.automation.dataproviders;

import org.testng.annotations.DataProvider;

import com.test.automation.configuration.Configuration;

/**
 * The Class HomeDataProvider.
 */
public class HomeDataProvider {

	/**
	 * Gets the data from properties file for home page.
	 *
	 * @return the url
	 */
	@DataProvider(name = "HomepageDataProvider", parallel = false)
	public static Object[][] getDatafromPropertiesFileforHomePage() {
		String url = Configuration.getConfig().getConfigProperty("BASE_URL");
		return new Object[][] { { url } };
	}
}
