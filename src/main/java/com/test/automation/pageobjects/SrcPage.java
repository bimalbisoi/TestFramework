package com.test.automation.pageobjects;
import com.test.automation.components.Src;
import com.test.automation.providers.WebdriverProvider;

public class SrcPage extends WebdriverProvider  {

	  public static Src getSrc() {
		    return new Src(driver);
		  }

}
