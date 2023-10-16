package FileManagement;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExcelFileHandling {

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod 
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	@Test(priority = 2)
	public void writeIntoExcelFile() throws IOException {
		FileInputStream fileIn = new FileInputStream(new File(".//src/test//resources//TestData//excelData.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fileIn);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFRow row = sheet.createRow(3);
		
		List<String> list = new ArrayList<String>(2);
		list.add("TC_003");
		list.add("Home Page");
		list.add("FAIL");
		for(int i=0;i<list.size();i++) {
			row.createCell(i).setCellValue(list.get(i));
		}
		
		FileOutputStream fileOut = new FileOutputStream(new File(".//src/test//resources//TestData//excelData.xlsx"));
		wb.write(fileOut);
		fileOut.close();		
	}
	 
	@Test(priority = 0)
	public void readExcelFileSingleRecord() throws IOException {
		FileInputStream fileIn = new FileInputStream(new File(".//src/test//resources//TestData//excelData.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fileIn);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFCell cell = sheet.getRow(1).getCell(0);
		if(cell.getStringCellValue().equals("TC_001")) {
			System.out.println("Testcase "+cell.getStringCellValue()+" Status is: "+sheet.getRow(1).getCell(2).getStringCellValue());
		}
		else {
			System.out.println("ELSE - The cell content is: "+cell.getStringCellValue());
		}
	}
	
	@Test(priority = 1)
	public void readExcelFileIterate() throws IOException {
		FileInputStream fileIn = new FileInputStream(new File(".//src/test//resources//TestData//excelData.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fileIn);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCnt = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		System.out.println("Excel Data: ");
		for(int i = 0;i<=rowCnt; i++) {
			int cellCnt = sheet.getRow(i).getLastCellNum();
			for(int j = 0; j<cellCnt; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
	}
}
