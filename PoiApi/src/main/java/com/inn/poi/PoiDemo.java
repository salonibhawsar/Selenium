package com.inn.poi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiDemo {

	public static void main(String args[]) throws IOException {
		getData("Register");
	}

	public static ArrayList<String> getData(String testcasename) throws IOException {

		ArrayList<String> alist = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\INDIAN\\Downloads\\ExcelTestData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheetCount = workbook.getNumberOfSheets();

		System.out.println(sheetCount);

		for (int i = 0; i < sheetCount; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("Data")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();

				Row firstRow = rows.next();

				Iterator<Cell> cells = firstRow.iterator();

				int c = 0;

				int columnpostion = 0;

				while (cells.hasNext()) {

					Cell cell = cells.next();

					if (cell.getStringCellValue().equalsIgnoreCase("Tests")) {

						columnpostion = c;

					}

					c++;

				}

				while (rows.hasNext()) {

					Row row = rows.next();

					Cell cell = row.getCell(columnpostion);

					if (cell.getStringCellValue().equalsIgnoreCase(testcasename)) {

						Iterator<Cell> citr = row.iterator();

						while (citr.hasNext()) {

							Cell cellvalue = citr.next();

							if (cellvalue.getCellType() == CellType.STRING) {

								alist.add(cellvalue.getStringCellValue());

							} else {

								alist.add(NumberToTextConverter.toText(cellvalue.getNumericCellValue()));

							}

						}

					}

				}

				workbook.close();

			}

		}

		return alist;

	}

}
