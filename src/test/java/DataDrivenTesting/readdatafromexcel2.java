package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdatafromexcel2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\readingfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Books");
		
		int rows=sheet.getLastRowNum();
		int columns=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Row count: "+rows);
		System.out.println("Column count: "+columns);
		
		for(int i=0;i<=rows;i++) {
			XSSFRow currentrows=sheet.getRow(i);
			
			for(int c=0;i<columns;c++) {
				XSSFCell cell=currentrows.getCell(c);
				System.out.println(cell+"/t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		

	}

}
