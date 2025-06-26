package testScripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row ;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;



public class DataPassedTestingToExcel {
	
	@Test
	public void setDataToExcelTest() throws IOException {

		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("MySheet");
			
		
		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("Name");
		headerRow.createCell(1).setCellValue("Place");

		Row dataRow = sheet.createRow(1);
		dataRow.createCell(0).setCellValue("Bharathi");
		dataRow.createCell(1).setCellValue("Pududkkottai");
			
			FileOutputStream fos = new FileOutputStream("SetData1.xlsx");
			wb.write(fos);
			fos.close();
			System.out.println("The file is written Successfullly ");
			
		}
		

}

