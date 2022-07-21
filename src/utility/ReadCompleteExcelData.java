package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCompleteExcelData {
	
	public static void main(String[] args) throws IOException {
		File src = new File("F:\\Desktop\\Katraj\\23 April\\Testdata.xlsx");
		
//		To load that particular location
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		int lastrownumber = sh1.getLastRowNum();
		
		int lastcolumnnumber = sh1.getRow(1).getLastCellNum();
//		String value = sh1.getRow(row).getCell(column).getStringCellValue();
//		
//		System.out.println(value);
		
		DataFormatter df = new DataFormatter();
		
		for(int row=0; row<=lastrownumber; row++)
		{
			for(int column=0; column<lastcolumnnumber; column++)
			{
		
		String formattedvalue = df.formatCellValue(sh1.getRow(row).getCell(column));
		
		System.out.println(formattedvalue);
		
			}
		
		}
	}

}
