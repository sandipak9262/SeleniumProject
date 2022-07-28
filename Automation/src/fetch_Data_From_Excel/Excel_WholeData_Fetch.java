package fetch_Data_From_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_WholeData_Fetch {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\Dipak Musale\\Desktop\\Excel Data\\Demo.xlsx");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		for (int i = 0; i <= data.getLastRowNum(); i++) { //row
			for (int j = 0; j <data.getRow(i).getLastCellNum(); j++) { //column
				String result = data.getRow(i).getCell(j).getStringCellValue();
				System.out.print(result + " ");
			}
			System.out.println();
		}
	}

}
