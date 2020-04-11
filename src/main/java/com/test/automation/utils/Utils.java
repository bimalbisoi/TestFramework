package com.test.automation.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {

	/**
	 * This method Take screenshot.
	 *
	 * @param driver the driver
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void takeScreenshot(WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(srcFile, new File(currentDirectory + "/Screenshots/" + System.currentTimeMillis() + ".png"));

	}
}
