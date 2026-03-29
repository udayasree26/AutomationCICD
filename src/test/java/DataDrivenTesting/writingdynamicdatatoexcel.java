package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingdynamicdatatoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writetoexcel_dynamic2.xlsx");
//		System.out.println(System.getProperty("user.dir"));
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Writedata_dynamic2");
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("How many rows are needed: ");
		int noofrows=sc.nextInt();
		
		System.out.println("How many columns are needed: ");
		int noofcol=sc.nextInt();
		
		for(int r=0;r<noofrows;r++){
			XSSFRow rows=sheet.createRow(r);
			for(int c=0;c<noofcol;c++) {
				XSSFCell cell=rows.createCell(c);
				System.out.println("Enter the dynamic data");
				cell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		sc.close();
		
		System.out.println("File is created...");

	}

	

}
