package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readData(String filename) throws IOException
	{
		XSSFWorkbook wb=new XSSFWorkbook("./Data/"+filename+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount=ws.getLastRowNum();
		System.out.println("Row Count is:  "+rowCount);
		int columnCount=ws.getRow(0).getLastCellNum();
		System.out.println("Column Count is:  "+columnCount);
				
		String[][] data=new String[rowCount][columnCount];
		//To retrieve Entire Data
		for(int i=1; i<=rowCount; i++)
		{
			XSSFRow row=ws.getRow(i);
			for(int j=0; j<columnCount; j++)
			{
				String allData=row.getCell(j).getStringCellValue();
				data[i-1][j]=allData;
				System.out.println("Entire data is :"+allData);
			}
		}
		
		wb.close();
		return data;
		
	}

}
