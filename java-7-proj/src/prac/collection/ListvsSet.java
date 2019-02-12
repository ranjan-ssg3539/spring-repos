package prac.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListvsSet {

	public static void main(String[] args) {
		//            List    Set
		//Duplicates  Yes     No
		// Order      Yes     Depends
		//Positional
		// ..access   Yes     No
		
		
		List<String> list = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();  // DoublyLinkedList in LinkedList
		
		Set<String> set = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>(); // Doubly linked list in LinkedHashSet
		
		
	}

}
