package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilitydata {

	public static void screenshot(WebDriver driver) throws IOException {
		File src = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:/Users/SOMESH/OneDrive/Desktop/New folder/new.jpg");
		FileHandler.copy(src, dest);
	}

	public static String datafile(int row,int cell) throws EncryptedDocumentException, IOException {
		String data;
		FileInputStream exceldata = new FileInputStream(
				"C:/Users/SOMESH/.eclipse/aks/TestExcekData/excel data file.xlsx");
		Sheet one = WorkbookFactory.create(exceldata).getSheet("Sheet1");
		try {
			data = one.getRow(row).getCell(cell).getStringCellValue();

		} catch (Exception e) {
			long userName = (long) one.getRow(row).getCell(cell).getNumericCellValue();
			data = (" " + userName);

		}
		return data;
	}
}
