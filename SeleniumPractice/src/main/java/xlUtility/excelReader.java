package xlUtility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {
	static XSSFWorkbook workbook ; 
	static XSSFSheet sheet;
	public excelReader(String excelPath, String sheetName) {
		try {
			workbook=new XSSFWorkbook(excelPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found");
		}
		sheet = workbook.getSheet(sheetName);
		
	}

}
