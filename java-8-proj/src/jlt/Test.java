package jlt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.SortedSet;

interface RKI {
	
}


class Parent implements RKI {
	
}

class Child extends Parent {
	
}

class Sth implements RKI {
	
}

public class Test {

	public static void main(String[] args) {
		//List <? extends RKI> list1 = new ArrayList<String>();
		List <? extends RKI> list1 = new ArrayList<Sth>();
		
		Random r = new Random();
		
		int i = r.nextInt();
		System.out.println(i);
		//SortedSet s = new SortedSet();
		/*List list = new ArrayList();
		list.add("b");
		list.add("a");
		Collections.reverse(list);
		for (Object o : Collections.reverse(list)) {
			
		}*/
		
	}

}
