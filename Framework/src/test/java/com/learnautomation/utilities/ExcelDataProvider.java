package com.learnautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws IOException
	
	{
	File src=new File("./TestData/TestData.xlsx");
	
	FileInputStream fis= new FileInputStream(src);
	
	 wb=new XSSFWorkbook(fis);
	
	}
	
	
	public String getStringData(int sheetIndex,int row,int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	
	public String getStringData(String sheetName,int row,int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumberData(String sheetName,int row,int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	
	public double getNumberData(int sheetIndex,int row,int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getNumericCellValue();
	}

}
