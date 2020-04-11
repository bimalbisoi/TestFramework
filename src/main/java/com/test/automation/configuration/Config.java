package com.test.automation.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 
 * Get and set the data for properties file
 */
public class Config {

	public Properties prop;
//	public FileOutputStream fos;

	/**
	 * 
	 * This constructor Load the properties file to make the file available to programme
	 */

	public Config() {
		File srcFile = new File("./src/main/resources/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(srcFile);
//			fos = new FileOutputStream(srcFile);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}

	}

	/**
	 * 
	 * Get the data from properties file
	 */
	public String getConfigProperty(String key) {
		String value = prop.getProperty(key);
		return value;
	}

	/**
	 * 
	 * Set the data to properties file
	 */
/*	public void setConfigProperty(String key, String value) {

		prop.setProperty(key, value);
		try {
			prop.store(fos, "comment");
		} catch (Exception e) {
			System.out.println("Exception while set the value is" + e.getMessage());
		}

	}*/
}
