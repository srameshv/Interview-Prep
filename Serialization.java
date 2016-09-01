import java.util.Hashtable;

public class Serialization {

	Node root;
	public static boolean Solution(String preOrder){
		String[] arr = preOrder.split(",");
		int diff = 1;
		for(String node : arr){
			if(--diff < 0) return false;
			if(!node.equals("#")){
				diff+=2;
			}
		}
		
		return diff==0;
	}
	public static void main(String [] args){
		String at = "9,3,4,#,#,1,#,#,2,#,6,#,#";
		System.out.println(Solution(at));
	}
}
