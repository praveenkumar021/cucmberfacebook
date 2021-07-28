package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\feature", glue = "org.step", dryRun = false, strict = true, monochrome = true, plugin = {
		"pretty", "html:C:\\Users\\WELCOME\\eclipse-workspace\\ZcucmberFace\\report\\HTMLReport",
		"json:C:\\Users\\WELCOME\\eclipse-workspace\\ZcucmberFace\\report\\JSONReport\\jsonreport.json",
		"junit:C:\\Users\\WELCOME\\eclipse-workspace\\ZcucmberFace\\report\\JUNITRport\\junitreport.xml" })
public class RunnerClass {

	@AfterClass
	public static void jvm() {
		JvmReport.jvmGenrateReport("C:\\Users\\WELCOME\\eclipse-workspace\\ZcucmberFace\\report\\JSONReport.json");

	}

}
