package excelreading;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_utility 
{
	XSSFWorkbook wb;
	
	XSSFSheet sheet1;
	
	public void setup()
	{
		try {
			File src=new File("D:\\Users\\NMP1\\OneDrive - JNJ\\Desktop\\Nithin\\Selinium input file\\TestDatas.xlsx");
			
			FileInputStream fis=new FileInputStream(src);
			
			wb=new XSSFWorkbook(fis);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String getdata(String sheetname,int rowcount,int columncount)
	{
		sheet1=wb.getSheet(sheetname);
		
		return(sheet1.getRow(rowcount).getCell(columncount).getStringCellValue());
	}
	
	
	
}
