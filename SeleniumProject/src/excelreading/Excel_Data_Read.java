package excelreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data_Read 
{

	public static void main(String[] args) throws Exception 
	{
		File src=new File("D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Selinium input file\\TestDatas.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheet("Sheet1");
		
		String cellvalue=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Cell Values is ==>>"+cellvalue);
		
		String cellvalue1=sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Cell Values is ==>>"+cellvalue1);
		
		wb.close();

	}

}
