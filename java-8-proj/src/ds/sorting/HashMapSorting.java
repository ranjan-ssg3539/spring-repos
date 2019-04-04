package ds.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSorting {

	public static void main(String[] args) {
		Map <Integer, String> hm = new HashMap<Integer,String>();
		hm.put(22, "bb");
		hm.put(4, "d");
		hm.put(3, "c");
		hm.put(11, "aa");
		for (Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
		List<Entry<Integer, String>> l = new ArrayList<Entry<Integer, String>>(hm.entrySet());
		Collections.sort(l, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
				//return e1.getValue().compareTo(e2.getValue());
				return e1.getKey().compareTo(e2.getKey());
			}
			
		});
		
		System.out.println("After sorting by key");
		for (Entry<Integer, String> e : l) {
			System.out.println(e.getKey() + " = "  + e.getValue());
		}

	}

}
