class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class LeafCount {
	Node root;
	int cnt =0;
	
	int getLeafCount(Node node) {
		if(node == null) {
			return 0;
		}
		if(node.left == null && node.right == null){
			return 1;
		}
		else {
			return getLeafCount(node.left) + getLeafCount(node.right); 
		}
	}
	public static void main(String [] args){
		LeafCount tree = new LeafCount();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("LeafCount in the tree is :"+tree.getLeafCount(tree.root));
	}
}