package fetch_Data_From_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getLastRowNum {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Dipak Musale\\Desktop\\Excel Data\\Demo.xlsx");
		int data = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		//int data = WorkbookFactory.create(file).getSheet("Sheet1").getFirstRowNum();
		System.out.println(data + 1);

	}

}
