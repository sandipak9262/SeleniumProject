package fetch_Data_From_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Row_Data_Fetch {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Dipak Musale\\Desktop\\Excel Data\\Demo.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

		short cellsize = sh.getRow(0).getLastCellNum();

		for (int i = 0; i < cellsize; i++) {
			String data = sh.getRow(3).getCell(i).getStringCellValue();
			System.out.print(data + " ");

		}
	}
}
