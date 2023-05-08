package org.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags= {"@FASDPMTC-18"},        monochrome = true, snippets = SnippetType.CAMELCASE,
dryRun = false, strict = false,        
             features = "src/test/resources", glue = "org.stepdefinition")

//  plugin = {"pretty", "json:target/cucumber.json" },        


//@DepartmentModule
//tags= {"@loc"}    
//tags= {"@FASLocMTC-17"}
//tags= {"@creat"}, 
//tags= {"@categoryModule"},
//tags= {"@FASLocMTC-06"} ,
//dryRun = true, strict = true,               		dryRun = false, strict = false,
//tags= {"@LocationMaster"},


//tags= {"@  @FASCMTC-35"},

//tags= {"@LocationMaster"},





@RunWith(Cucumber.class)

public class TestRunner {
	
	@AfterClass
	public static void afterClass() throws InterruptedException {

		Reporting.generateJVMReport(System.getProperty("user.dir")+"\\target\\cucumber.json" );

		
	}

	
}

