package collection.prac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTreemap {
	// Treemap -> stores in sorted order
	// LinkedHashmap -> Stores in sorted order
	// Hashmap -> Stores as per hash key (so no sorting or order)

	public static void main(String[] args) {
		Map<String, String> tm = new TreeMap<String, String>();
		//Map<String, String> tm = new LinkedHashMap<String, String>();
		//Map<String, String> tm = new HashMap<String, String>();
		
		tm.put("d", "d");
		tm.put("a", "a");
		tm.put("c", "c");
		tm.put("b", "b");

		Iterator itr = tm.entrySet().iterator();
		/*while (itr.hasNext()) {
			Entry e = (Entry) itr.next();
			System.out.println( e.getKey() + " " + e.getValue());
		}*/
		
		
				
		
		
	}

}
