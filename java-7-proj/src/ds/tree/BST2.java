package ds.tree;



public class BST2 {
	class Node {
		int val;
		Node left;
		Node right;
	}

	class Tree {
		Node root;
		Tree() {
			root = null;
		}
		
		/* function to print level order traversal of tree*/
	    void printLevelOrder() 
	    { 
	        int h = height(root); 
	        int i; 
	        for (i=1; i<=h; i++) 
	            printGivenLevel(root, i); 
	    } 
	  
	    /* Compute the "height" of a tree -- the number of 
	    nodes along the longest path from the root node 
	    down to the farthest leaf node.*/
	    int height(Node root) 
	    { 
	        if (root == null) 
	           return 0; 
	        else
	        { 
	            /* compute  height of each subtree */
	            int lheight = height(root.left); 
	            int rheight = height(root.right); 
	              
	            /* use the larger one */
	            if (lheight > rheight) 
	                return(lheight+1); 
	            else return(rheight+1);  
	        } 
	    } 
	  
	    /* Print nodes at the given level */
	    void printGivenLevel (Node root ,int level) 
	    { 
	        if (root == null) 
	            return; 
	        if (level == 1) 
	            System.out.print(root.val + " "); 
	        else if (level > 1) 
	        { 
	            printGivenLevel(root.left, level-1); 
	            printGivenLevel(root.right, level-1); 
	        } 
	    }
		
		void insert(int newVal) {
			Node newNode = new Node();
			newNode.val = newVal;
			if (root == null) {
				root = newNode;
			} else {
				Node temp = root;
				Node temp2 = null;
				while (temp != null) {
					temp2 = temp;
					if (newVal > temp.val) {
						temp = temp.right;
					} else {
						temp = temp.left;
					}				
				}
				if (temp2.val < newVal) {
					temp2.right = newNode;
				} else {
					temp2.left = newNode;
				}
			}
		}
	}

	public static void main(String[] args) {
		BST2.Tree t = new BST2().new Tree();
		t.insert(10); t.insert(15); t.insert(5); t.insert(3); t.insert(8); t.insert(13); t.insert(17); 
		t.printLevelOrder();	

	}

}
