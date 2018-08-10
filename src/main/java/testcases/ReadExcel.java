package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class ReadExcel {
	
	public Object[][] readExcel(String fileName) throws IOException {
		
		String path="./data/"+fileName+".xlsx";
		XSSFWorkbook wBook=new XSSFWorkbook(path);
		XSSFSheet wSheet=wBook.getSheetAt(0);
		
		//To get the row and column count
		int rows=wSheet.getLastRowNum();
		//int rows=wSheet.getPhysicalNumberOfRows(); -- This is to get the row count including header row..!
		XSSFRow headerRow=wSheet.getRow(0);
		int cols=headerRow.getLastCellNum();
		
		Object[][] data=new Object[rows][cols];
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow eachRow=wSheet.getRow(i);
			for(int j=0;j<cols;j++)
			{
				try {
					XSSFCell eachCell=eachRow.getCell(j);
					String eachValue=eachCell.getStringCellValue();
					data[i-1][j]=eachValue;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					data[i-1][j]="";
				}
			}
		}
	
		wBook.close();
		
		return data;
	}

}
