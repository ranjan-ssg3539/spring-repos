package misc;

import java.util.ArrayList;
import java.util.List;

public class NumberOfDates {

	public static void main(String[] args) {
		String str = "India got independence on 15-08-1947. UN was established on 24-10-194524-10-1945";
		int count = 0;
		for (int i=0; i<= str.length()-10; i++) { // i<=str.length()-10  as last digit + 1 is counted in substring 
			if (str.substring(i, i+10).matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
