package org.step;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.pom.PojoClass;

import io.cucumber.java.en.*;

public class StepDifintion extends BaseClass {
	public PojoClass po;

	@When("User has to Click Creat New Account")
	public void user_has_to_Click_Creat_New_Account() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
		po = new PojoClass();

		clkbtn(po.getUsercreat());

	}

	@When("user has to Enter Firstname and Lastname")
	public void user_has_to_Enter_Firstname_and_Lastname() throws IOException {
		fillText(po.getUserfirstname(), excelRead("Sheet1", 0, 1));
		fillText(po.getUserlastname(), excelRead("Sheet1", 1, 1));

	}

	@When("user has to Enter Email address")
	public void user_has_to_Enter_Email_address() throws IOException {
		fillText(po.getUseremail(), excelRead("Sheet1", 2, 1));

	}

	@When("user has to Enter Date of Birth")
	public void user_has_to_Enter_Date_of_Birth() throws IOException {
		dropdown(po.getUserBdayday(), excelRead("Sheet1", 3, 1));
		dropdownvalue(po.getUserbdaymonth(), excelRead("Sheet1", 4, 1));
		dropdown(po.getUserbdayyear(), excelRead("Sheet1", 5, 1));
	}

	@When("user has to click Gender")
	public void user_has_to_click_Gender() throws IOException {

		clkbtn(po.getUsergender());

	}

}
