class BSTNode{
	int data;
	BSTNode left;
	BSTNode right;
	public BSTNode(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
public class BinarySearchTree {
	public BSTNode root;
	public BinarySearchTree(){
		this.root = null;
	}
	public void insertNode(int id){
		BSTNode newNode = new BSTNode(id);
		
		if(root == null){
			root = newNode;
			return;
		}
		BSTNode current =  root;
		BSTNode parent =  null;
		while(true){
			parent = current;
			if(current.data >id){
				current = current.left;
				if(current == null){	
					parent.left = newNode;
					return;
				}
			}else {
				current = current.right;
				if(current == null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
}
