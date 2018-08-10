package Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	 public Object[][] readExcel(String filename ,int index) throws IOException
	 {  
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = wBook.getSheetAt(index);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
	    short columncount = sheet.getRow(0).getLastCellNum();
	    System.out.println(columncount);
	    //Read the data 
	    Object [][] data = new Object[rowcount][columncount];
	    for (int i=1;i<=rowcount;i++)
	    {
	    	XSSFRow row = sheet.getRow(i);
	    	for (int j =0;j<columncount;j++)
	    	{
	    		XSSFCell cell = row.getCell(j);
	    		data[i-1][j] = cell.getStringCellValue();
	    		 String stringCellValue = cell.getStringCellValue();
	    		System.out.print(stringCellValue);
	    		System.out.println();
	    		
	    	}
	    }
	    
	    wBook.close();
	    return data ;
	    		
	 }
}
