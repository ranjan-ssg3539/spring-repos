package jlt;

/*Exercise 6: Write a program that accepts 10 student records (roll number and score) and prints them in decreasing order of scores. In case there are multiple records pertaining to the same student, the program should choose a single record containing the highest score. The program should be capable of accepting a multi-line input. Each subsequent line of input will contain a student record, that is, a roll number and a score (separated by a hyphen). The output should consist of the combination of roll number and corresponding score in decreasing order of score.
INPUT to program

1001-40
1002-50
1003-60
1002-80
1005-35
1005-55
1007-68
1009-99
1009-10
1004-89

OUTPUT from program

1009-99
1004-89
1002-80
1007-68
1003-60
1005-55
1001-40*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortHashMap_StudentMarks {

	public static void main(String[] args) {
		System.out.println("Enter  student details:");
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String nl = sc.nextLine();
			if (nl.isEmpty()) {
				break;
			}
			String [] eachLine = nl.split("-");
			if (hm.containsKey(Integer.parseInt(eachLine[0]))) {
				if (hm.get(Integer.parseInt(eachLine[0])) < Integer.parseInt(eachLine[1])) {
					hm.put(Integer.parseInt(eachLine[0]), Integer.parseInt(eachLine[1]));
				}
			} else {
				hm.put(Integer.parseInt(eachLine[0]), Integer.parseInt(eachLine[1]));
			}
		}
				
		List<Entry<Integer, Integer>> ll = new ArrayList<Entry<Integer, Integer>>(hm.entrySet());
		
		Collections.sort(ll, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
				return e2.getValue().compareTo(e1.getValue());
			}
		});
		
		for (Entry<Integer, Integer> e : ll) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}	
	}
}
