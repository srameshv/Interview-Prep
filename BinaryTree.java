// Iterative Queue based Java program to do level order traversal
// of Binary Tree
 
/* importing the inbuilt java classes required for the program */
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
	Node root;
	boolean isBst() {
		return isBstUtil(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	boolean isBstUtil(Node node, int min, int max){
		if(node == null){
			return false;
		}
		if(node.data < min || node.data > max) {
			return false;
		}
		return isBstUtil(node.left, min, node.data-1) && isBstUtil(node.right, node.data+1, max);
	}
	void printLevelOrder(){
		Queue<Node> traversalQ = new LinkedList<Node>();
		traversalQ.add(root);
		while(!traversalQ.isEmpty()){
			Node curr = traversalQ.poll();
			System.out.println("NODE "+curr);
			if(curr.left != null){
				traversalQ.add(curr.left);			
			}
			else {
				traversalQ.add(curr.right);	
			}
		}
	}
	public static void main(String [] args){
		BinaryTree treeLevel = new BinaryTree();
	}
}
