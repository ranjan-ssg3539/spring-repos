package ds.misc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<String> q1 = new LinkedList<String>();
	Queue<String> q2 = new LinkedList<String>();
	
	public void push(String val) {
		q1.add(val);
		while (! q1.isEmpty()) {
			q2.add(q1.remove());
		}
		Queue<String> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	public String pop() {
		q1.p
		return q1.remove();
	}
	
	public void display() {
		Iterator itr = q1.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		StackUsingQueue s1 = new StackUsingQueue();
		s1.push("a");
		s1.push("b");
		s1.push("c");
		s1.pop();
		s1.display();
		
	}

}
