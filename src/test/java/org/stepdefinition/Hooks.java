package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{

	@Before
	public void beforeClass() throws IOException {
		
		getDriver("chrome");
		getUrl("http://13.71.105.174:8081/");
		impWait();
		maximize();
		
	}

	@After
	public void afterClass(Scenario scenario) throws InterruptedException {

		//if (scenario.isFailed()) {


		TakesScreenshot takesScreenshot  = (TakesScreenshot) driver;
		byte[] screenshotAs = takesScreenshot.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotAs, "Scenario");
		//System.out.println("sc taken Form hooks Class");

		
		sleep(5000);
		System.out.println("quit in hooks working");
	quit();
	
	
	}
	
	
	
	
	
	
}
