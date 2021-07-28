package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void jvmGenrateReport(String jsonpath) {
		File f = new File("C:\\Users\\WELCOME\\eclipse-workspace\\ZcucmberFace\\report\\JVMReport");

		Configuration c = new Configuration(f, "FacebookRegistration");
		c.addClassifications("platform", "windows");
		c.addClassifications("selenium", "3.141.59");

		List<String> l = new LinkedList<String>();
		l.add(jsonpath);

		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();

	}

}
