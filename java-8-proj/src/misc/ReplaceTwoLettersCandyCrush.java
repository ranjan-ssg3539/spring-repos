package misc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ReplaceTwoLettersCandyCrush {
	static char [] arr = {'a','c','b','a','a','b','c','e','f','g','g','f','e','d'};
	
	public static void main(String[] args) {
		Stack s = new Stack();
		for (int i=0; i< arr.length; i++) {
			if (i==0) {
				s.push(arr[i]);
			} else if ((char)s.get(s.size()-1) != arr[i]) {
				s.push(arr[i]);	
			} else if ((char)s.get(s.size()-1) == arr[i]) {
				s.pop();
			}
			
		}
		System.out.println(s);
	}

}
