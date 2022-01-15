package com.excelDataReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class excelDataReader {
	
	 public static void main(String[] args) throws IOException {
		 File fs=new File("/Desktop/textdata");
		 
		 FileInputStream fin=new FileInputStream(fs);
		 
	
		
		XSSFWorkbook workbook= new XSSFWorkbook(fin);
		
		XSSFSheet sheet = workbook.getSheet("Sheet3");
		
		int rowNum=sheet.getLastRowNum();
		
		System.out.println("Number of Rows: "+rowNum);
		
		int ColNum=sheet.getLeftCol();
		
		System.out.println("Number of Column: "+ColNum);
		
		workbook.close();
	}

}
