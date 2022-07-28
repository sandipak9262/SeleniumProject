package fetch_Data_From_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\Dipak Musale\\Desktop\\Excel Data\\Demo.xlsx");

		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		 int result = data.getLastRowNum();
		
		for(int i=0;i<=result;i++) {
		System.out.println(data.getRow(i).getCell(4).getStringCellValue()+" ");
			
		}
	}

}
