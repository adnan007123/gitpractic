package homeseleniump1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class excelsheet {
WebDriver driver;
// if office version is 2007 or later we used xssf else hssf
XSSFWorkbook workbook;
XSSFSheet sheet;
XSSFCell cell;

	
	
	@Test
public void readwrite() throws IOException{
		
		//importsheet
		
		File src = new File("D://abc.xlsx");
		//upload file
		FileInputStream fis = new FileInputStream(src);
		//load workbook
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		
		//loop
		
		for (int i =0;i<=sheet.getLastRowNum();i++)
		{
			cell=sheet.getRow(i).getCell(0);
			cell.setCellType();
		}
		
		

	}
		
	

}
