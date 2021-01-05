package excelreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data_Read_Forloop 
{

	public static void main(String[] args) throws Exception 
	{
		File src=new File("D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Selinium input file\\TestDatas.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheet("Sheet1");
		
		int count=sheet1.getLastRowNum();
		
		for(int i=0;i<=count;i++)
		{
			String s=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data of "+i+"row is"+s);
		}
		
		wb.close();

	}

}
