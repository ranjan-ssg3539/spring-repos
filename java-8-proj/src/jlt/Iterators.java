package jlt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Iterators {

	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		
		/*CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("a");list.add("b");list.add("c");list.add("d");
		//Iterator itr = list.iterator();
		Iterator itr = list.iterator();
		int c = 0;
		while(itr.hasNext()) {	
			String s = itr.next().toString();
			if ("b".equals(s)) {
				itr.remove();
			}
			

		}*/
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("a");list.add("b");list.add("c");list.add("d");
		//Iterator itr = list.iterator();
		Iterator itr = list.iterator();
		int c = 0;
		while(itr.hasNext()) {	
			String s = itr.next().toString();
			if ("b".equals(s)) {
				list.add("22");// not reflected in the iterator but in the list
			}
			

		}
		// Try adding using particular collection method directly into both list. Then check iterators
		// Try doing using iterator add remove
		
		System.out.println(list);
		
		
	}

}
