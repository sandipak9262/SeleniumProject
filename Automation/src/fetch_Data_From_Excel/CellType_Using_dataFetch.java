package fetch_Data_From_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellType_Using_dataFetch {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Dipak Musale\\Desktop\\Excel Data\\Demo.xlsx");
		Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet2").getRow(7).getCell(4);
		CellType ct = cellinfo.getCellType();
		
		if(ct==CellType.STRING) {
			System.out.println(cellinfo.getStringCellValue());
		}else if(ct==CellType.BOOLEAN) {
			System.out.println(cellinfo.getBooleanCellValue());
		}
		else if(ct==CellType.NUMERIC) {
			System.out.println(cellinfo.getNumericCellValue());
		}

	}

}
