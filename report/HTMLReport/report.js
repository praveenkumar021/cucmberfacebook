$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/facebookregistration.feature");
formatter.feature({
  "name": "To Validate the Facebook Registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Validate the Functionality of Facebook Registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to Click Creat New Account",
  "keyword": "When "
});
formatter.match({
  "location": "StepDifintion.user_has_to_Click_Creat_New_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to Enter Firstname and Lastname",
  "keyword": "When "
});
formatter.match({
  "location": "StepDifintion.user_has_to_Enter_Firstname_and_Lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to Enter Email address",
  "keyword": "When "
});
formatter.match({
  "location": "StepDifintion.user_has_to_Enter_Email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to Enter Date of Birth",
  "keyword": "And "
});
formatter.match({
  "location": "StepDifintion.user_has_to_Enter_Date_of_Birth()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with value: Apr\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-VCH8ME7\u0027, ip: \u0027192.168.0.108\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.findOptionsByValue(Select.java:283)\r\n\tat org.openqa.selenium.support.ui.Select.selectByValue(Select.java:186)\r\n\tat org.base.BaseClass.dropdownvalue(BaseClass.java:61)\r\n\tat org.step.StepDifintion.user_has_to_Enter_Date_of_Birth(StepDifintion.java:39)\r\n\tat ✽.user has to Enter Date of Birth(file:src/test/resources/feature/facebookregistration.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user has to click Gender",
  "keyword": "When "
});
formatter.match({
  "location": "StepDifintion.user_has_to_click_Gender()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});