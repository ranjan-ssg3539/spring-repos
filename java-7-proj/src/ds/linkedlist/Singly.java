package ds.linkedlist;

class Node {
	int val;
	Node next;
}

class SinglyLL {
	Node root;
	public SinglyLL() {
		
	}
	
	void insert(int newVal) {
		Node newNode = new Node();
		newNode.val = newVal;
		newNode.next = null;
		if (root == null) {
			root = newNode;
		} else {
			Node temp  = null;
			for (temp = root; temp.next != null; temp=temp.next);
			temp.next = newNode;
		}
	}
	
	void display() {
		if (root == null) {
			System.out.println("empty list");
		} else {
			Node temp = null;
			for (temp = root; temp!= null; temp=temp.next) {
				System.out.println(" " + temp.val);
			}
		}
	}
}


public class Singly {

	public static void main(String[] args) {
		SinglyLL  sll = new SinglyLL();
		sll.insert(1);sll.insert(2);sll.insert(3);sll.insert(4);
		sll.display();

	}

}
