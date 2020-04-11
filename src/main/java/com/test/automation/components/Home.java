package com.test.automation.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The Class Home.
 */
public class Home {
	WebDriver driver;

	/**
	 * Instantiates a new home.
	 *
	 * @param ldriver the driver
	 */
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath ="//input[@id= 'searchBox']")
	private WebElement searchBoxTextField;

	@FindBy(css = ".ra-search")
	private WebElement searchBoxButton;

	/**
	 * Gets the search box text field.
	 *
	 * @return the search box text field
	 */
	public WebElement getSearchBoxTextField() {
		return this.searchBoxTextField;
	}

	/**
	 * Click search box button.
	 */
	public void clickSearchBoxButton() {
		this.searchBoxButton.click();
	}
}
