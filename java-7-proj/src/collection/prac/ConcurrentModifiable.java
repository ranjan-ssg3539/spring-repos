package collection.prac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModifiable {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
		//Map<String, String> chm = new HashMap<String, String>();
		chm.put("1", "1");
		chm.put("2", "1");
		chm.put("3", "1");
		chm.put("4", "1");
		
				
		Iterator itr = chm.entrySet().iterator();
		int counter = 1;
				
		while (itr.hasNext()) {
			counter++;
			
			if (counter == 2) {
				chm.put("8", "1");
			}			
			Entry e = (Entry) itr.next();
			System.out.println(e.getKey());
		}

	}

}
