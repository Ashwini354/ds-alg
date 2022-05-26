package com.ds.utlity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadingDataFromXl {
	public static void main(String[] args) throws IOException {
		getData();
	}

	@DataProvider(name = "logindata")
	public static String[][] getData() throws IOException

	{
		FileInputStream fs = new FileInputStream(
				"/Users/ashwiniramamurthy/eclipse-workspace/ds-alg/src/main/resources/text.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fs);
		XSSFSheet sheet = book.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(1).getLastCellNum();
		String[][] data = new String[rowcount][cellcount];
		try {
			for (int i = 1; i <= rowcount; i++) {
				for (int j = 0; j < cellcount; j++) {
					DataFormatter df = new DataFormatter();
					System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
					data[i-1][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
				}

			}
			for (String[] data1 : data) {
				System.out.println(Arrays.toString(data1));

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return data;

	}
	@DataProvider(name = "code")
	public static String[][] getData2() throws IOException

	{
		FileInputStream fs = new FileInputStream(
				"/Users/ashwiniramamurthy/eclipse-workspace/ds-alg/src/main/resources/text.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fs);
		XSSFSheet sheet = book.getSheet("sheet2");
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowcount+1][cellcount];
		try {
			for (int i = 0; i <= rowcount; i++) {
				for (int j = 0; j < cellcount; j++) {
					DataFormatter df = new DataFormatter();
					System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
					data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
				}

			}
			for (String[] data1 : data) {
				System.out.println(Arrays.toString(data1));

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return data;
	}
}
