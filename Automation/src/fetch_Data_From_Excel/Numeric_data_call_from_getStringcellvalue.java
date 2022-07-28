package fetch_Data_From_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numeric_data_call_from_getStringcellvalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Dipak Musale\\Desktop\\Excel Data\\Demo.xlsx");
        Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
        String data = sh.getRow(1).getCell(1).getStringCellValue();
         System.out.println(data);
	}

}
