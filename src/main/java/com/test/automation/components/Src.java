package com.test.automation.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Src {
 
	WebDriver driver;
	
	public Src(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, Src.class);
	}
	
	@FindBy(css="#desktop-price-div")
	private WebElement priceFilter;
	
	@FindBy(xpath="//iframe[contains(@id,'/TILE1/RDC2/SRPLIST/SALE/DESK_0')]")
	private WebElement inline4thAdInSRPListViewImage;
	
	@FindBy(xpath="//a[@data-omtag='srp:list-view'][1]")
	private WebElement listView;
	
	public void clickPriceFilter() {
	priceFilter.click();
	}
	
	public void displayPriceFilter() {
		priceFilter.isDisplayed();
		}
		

	
	public void displayInline4thAdInSRPListViewImage() {
		inline4thAdInSRPListViewImage.isDisplayed();
		}

	public void clickListView() {
		listView.click();
	}
	
	public void displayListView() {
		listView.isDisplayed();
		}
}
