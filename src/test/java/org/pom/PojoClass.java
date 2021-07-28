package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement usercreat;

	@FindBy(name = "firstname")
	private WebElement userfirstname;

	@FindBy(name = "lastname")
	private WebElement userlastname;

	@FindBy(name = "reg_email__")
	private WebElement useremail;

	@FindBy(name = "birthday_day")
	private WebElement userBdayday;

	@FindBy(name = "birthday_day")
	private WebElement userbdaymonth;

	@FindBy(id = "year")
	private WebElement userbdayyear;

	@FindBy(xpath = "//label[contains(text(),'Female')]")
	private WebElement usergender;

	public WebElement getUsercreat() {
		return usercreat;
	}

	public WebElement getUserfirstname() {
		return userfirstname;
	}

	public WebElement getUserlastname() {
		return userlastname;
	}

	public WebElement getUseremail() {
		return useremail;
	}

	public WebElement getUserBdayday() {
		return userBdayday;
	}

	public WebElement getUserbdaymonth() {
		return userbdaymonth;
	}

	public WebElement getUserbdayyear() {
		return userbdayyear;
	}

	public WebElement getUsergender() {
		return usergender;
	}
	

}
