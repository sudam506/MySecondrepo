package launching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDatafromExcelSheet {

	public static void main(String[] args) throws IOException {
	
	// this is to set the filepath to open the excel file in input mode 	
		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\OneDrive\\Documents");

   //acess the required test data sheet
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet=workbook.getSheet("sheet1");

	//to get no. of row & column 
	    int rowcount=sheet.getLastRowNum();
	    int cellcount=sheet.getRow(0).getLastCellNum();
	
	 for(int i=0;i<rowcount; i++) {
		 XSSFRow currentrow=sheet.getRow(i);
	
	 for(int j=0; j<cellcount; j++) {
	 
	String value= currentrow.getCell(j).toString(); //read value fron cell
	 
	 System.out.print("  "+value);}
	System.out.println();
	
	}
	}
}
