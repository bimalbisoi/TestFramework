package com.test.automation.listeners;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.test.automation.providers.WebdriverProvider;
import com.test.automation.utils.Utils;

public class WebEventListeners extends WebdriverProvider  implements WebDriverEventListener {

	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("Before Alert Accept");
		
	}

	public void afterAlertAccept(WebDriver driver) {
		System.out.println("After Alert Accept");
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("Before Alert Dismiss");
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("After Alert Dismiss");
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before navigate to URL Is :"+url );
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After navigate to URL Is:"+url );
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before Navigate Back");
		
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After Navigate Back");
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Before Navigate Forward");
		
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("After Navigate Forward");
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Before Page Refresh");
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("After Page Refresh");
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		//System.out.println("Before  Find the  Webelemnt Is:"+element.toString());
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		//System.out.println("Successfully  Found the  Webelemnt and the Webelemnt Is:"+element.toString());
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Before click the Webelement is:"+element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Successfully  clicked the  Webelemnt and the Webelemnt Is:"+element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Before Switch the Window Name is:"+windowName);
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Successfully Switched the Window and the Window Name is:"+windowName);
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("Exception occured:"+throwable);
		try {
			Utils.takeScreenshot(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("Before get the Text from Webelemnt Is:"+element.getText());
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("Suceesfully Got the Text from Webelemnt and the Text Is:"+element.getText());
		
	}

}
