package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingdatafromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\booklist.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int totalrows=sheet.getLastRowNum();
	
		int columns=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows: "+totalrows);
		System.out.println("Total number of columns: "+columns);
		
		for(int r=0;r<=totalrows;r++) {
			
			XSSFRow currentrows=sheet.getRow(r);
			
			for(int c=0;c<columns;c++) {
				XSSFCell cell=currentrows.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
	}

}
