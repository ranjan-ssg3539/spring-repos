package collection.prac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayMaxDiff {

	public static void main(String[] args) {
		HashMap k;
		
		boolean isFirstTime = true;
		int maxDiff = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);  list.add(10);  list.add(8);  list.add(7); list.add(6); list.add(5);
		for (int i=1; i< list.size(); i++) {
			for (int j=0; j<i; j++) {
				if (list.get(j) < list.get(i)) {
					int temp = list.get(i) - list.get(j);
					if (isFirstTime) {
						maxDiff = temp;
						isFirstTime = false;
					} else if (maxDiff < temp) {
						maxDiff = temp;
					}
				}
			}			
		}
		System.out.println(maxDiff);

	}

}
