package org.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void lunchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void lunchUrl(String text) {
		driver.get(text);

	}

	public static void lunchurl2(String text) {
		driver.get(text);

	}

	public static void fillText(WebElement e, String text) {
		e.sendKeys(text);

	}

	public static void clkbtn(WebElement e) {
		e.click();

	}

	public static void dropdown(WebElement e, String text) {
		Select sc = new Select(e);
		sc.selectByVisibleText(text);

	}

	public static void dropdownvalue(WebElement e, String text) {
		Select sc = new Select(e);
		sc.selectByValue(text);

	}
	public static void dropdownindex(WebElement e,int indexno) {
		Select sc = new Select(e);
		sc.selectByIndex(indexno);

	}

	public static String excelRead(String sheet, int row, int cell) throws IOException {
		FileInputStream f = new FileInputStream(
				"C:\\Users\\WELCOME\\eclipse-workspace\\ZcucmberFace\\src\\test\\java\\org\\data\\dataFile.xlsx");
		Workbook w = new XSSFWorkbook(f);

		Sheet sheet2 = w.getSheet(sheet);
		Row row2 = sheet2.getRow(row);
		Cell cell2 = row2.getCell(cell);

		int cellType = cell2.getCellType();
		String value;
		if (cellType == 1) {
			value = cell2.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(cell2)) {
			Date d = cell2.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
			value = s.format(d);

		} else {
			double d = cell2.getNumericCellValue();
			long l = (long) d;

			value = String.valueOf(l);
		}
		return value;

	}

}
