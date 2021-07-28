package org.step;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public static void lunch() {
		lunchBrowser();
		lunchurl2("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

	}

	@After
	public static void closing() {

	}

}
