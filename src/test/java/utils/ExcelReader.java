package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelReader {
	
	public HashMap<String, String> ReadData() throws IOException {

		FileInputStream fis = new FileInputStream("C://Users//KARTHI//automation//AppleUITesting//src//test//java//utils//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		
		HashMap<String,String> data = new HashMap<String,String>();
		
		for(int r=0;r<=rows;r++) {
			String key = sheet.getRow(r).getCell(0).getStringCellValue();
			String value = sheet.getRow(r).getCell(1).getStringCellValue();
			data.put(key, value);
		}
		
		return data;
			
	}
	
}
