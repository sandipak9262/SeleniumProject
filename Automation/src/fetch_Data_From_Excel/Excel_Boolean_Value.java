package fetch_Data_From_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Boolean_Value {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream("C:\\Users\\Dipak Musale\\Desktop\\Excel Data\\Demo.xlsx");
			boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
			System.out.println(data);

	}

}
