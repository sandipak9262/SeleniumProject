package fetch_Data_From_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Data_Fetch {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Dipak Musale\\Desktop\\Excel Data\\Demo.xlsx");
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		System.out.println(data);
	} 	
}
