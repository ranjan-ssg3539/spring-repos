package misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringFrecuency {

	public static void main(String[] args) {
		String str = "techjini";
		char [] cArr = str.toCharArray();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i=0; i<cArr.length; i++) {
			if (map.containsKey(String.valueOf(cArr[i]))) {
				int val = map.get(String.valueOf(cArr[i]));
				val ++;
				map.put(String.valueOf(cArr[i]), val);
			} else {
				map.put(String.valueOf(cArr[i]), 1);
			}
		}
		Iterator itr = map.keySet().iterator();
		while(itr.hasNext()) {
			String s = String.valueOf(itr.next());
			System.out.println(s + " = " + map.get(s));
		}

	}

}
