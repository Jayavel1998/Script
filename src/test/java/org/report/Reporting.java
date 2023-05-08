package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	
public static void generateJVMReport(String jsonFile) {
		
		File file = new File(System.getProperty("user.dir")+"\\target");
		
		Configuration configuration = new Configuration(file, "FASOFT  AUTOMATION REPORTS");
		configuration.addClassifications("os","Window10");
		configuration.addClassifications("Browser","chrome");
		configuration.addClassifications("Version"," 110.0.5481.96");
		configuration.addClassifications("Sprint","1");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
		
	}

}
