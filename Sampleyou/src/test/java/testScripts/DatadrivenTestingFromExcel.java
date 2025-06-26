package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DatadrivenTestingFromExcel {
	
	@Test
	public  void getDataFromExcelTest() throws Throwable, IOException {
		
		FileInputStream fis = new FileInputStream("./ExternalFiles/PeopleData.xlsx");
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet =  wb.getSheetAt(0);
		
				
				int  totalRows = sheet.getPhysicalNumberOfRows();
				System.out.println("The total Number of rows are "+totalRows);
				
				int totalColumns = sheet.getRow(0).getLastCellNum();
				System.out.println("The total Number of columns are "+totalColumns);
				
				for(int i = 0; i <= totalRows; i++) {
					
					Row row = sheet.getRow(i);
					
					for(int j = 0; j<totalColumns; j++)
					{	
						Cell  cell = row.getCell(j);
						
						cell.setCellType(CellType.STRING);
					
						System.out.print(String.format("%20s",cell.getStringCellValue()) );
			
					}
					System.out.println();
					}
				
		
	}

}
