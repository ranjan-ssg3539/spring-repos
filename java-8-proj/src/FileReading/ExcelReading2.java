package FileReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("/home/ranjan/Documents/test.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheetAt(0);
		Iterator itr = s.iterator();
		int count = 0;
		//
		FileOutputStream fo = new FileOutputStream("/home/ranjan/Documents/testCopy.xlsx");
		Workbook copyWb = new XSSFWorkbook();
		Sheet copySheet = copyWb.createSheet("CopySheet1");
		
		while (itr.hasNext()) {
			Row r = (Row) itr.next();
			if (count++ > 1) {
				Row copyRow = copySheet.createRow(count);
				copyRow.createCell(0).setCellValue(r.getCell(0).getStringCellValue());
				copyRow.createCell(1).setCellValue(r.getCell(0).getStringCellValue());
			}			
		}		
		copyWb.write(fo);
	}

}
