package FileReading;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CSVReading {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/home/ranjan/Documents/test.csv"));
		String line = null;
		/*while ((line = br.readLine()) != null) {
			System.out.println(line);
		}*/
		
		InputStream is = new FileInputStream("/home/ranjan/Documents/test.csv");
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		InputStreamReader ir;

	}

}
