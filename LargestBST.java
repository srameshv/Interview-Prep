
public class LargestBST {
	Node root;
	static int size =0;
	
	public static void largestBST(Node root){
		if(root == null){
			System.out.println("The tree is empty");
			return;
		}
		if(root.data < root.right.data && root.data> root.left.data) {
			size++;
		}
		largestBST(root.left);
		largestBST(root.right);
	}
	
}
