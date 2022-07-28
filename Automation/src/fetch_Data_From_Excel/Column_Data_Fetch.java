package fetch_Data_From_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Column_Data_Fetch {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Dipak Musale\\Desktop\\Excel Data\\Demo.xlsx");
        Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
          //short data = sh.getRow(0).getLastCellNum();
          int data = sh.getLastRowNum();
        
        for(int i=0;i<=data;i++){
        	String result = sh.getRow(i).getCell(0).getStringCellValue();
        	System.out.println(result);
        }
 
	}

}
