package com.test.automation.pageobjects;

import com.test.automation.components.Home;
import com.test.automation.providers.WebdriverProvider;

/**
 * The Class HomePage.
 */
public class HomePage extends WebdriverProvider {

	/**
	 * This method created the Object of Home class
	 *
	 * @return the home
	 */
	public static Home getHome() {
		Home home = new Home(driver);
		return home;
	}

}
