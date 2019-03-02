package FileReading;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	// BufferedReader -> Reading characters from any source
	// InputStream    -> Reading raw binay data
	
	
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("/home/ranjan/Documents/test.xlsx");
		Workbook workBook = new XSSFWorkbook(is);
		Sheet sheet1 = workBook.getSheetAt(0);
		Iterator itr = sheet1.iterator();
		while (itr.hasNext()) {
			Row row = (Row) itr.next();
			Cell c = row.getCell(0);
			System.out.println(c);
		}
		

	}

}
