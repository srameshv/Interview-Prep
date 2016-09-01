//if root is selected then I cannot rob the children so have to find out the 
//max value

public class HouseRobber {

	/*Use an array to store two values,one where the root is not selected
	 * the other where it is selected*/
	public int [] maxVal(Node root){
		int [] result = new int[2];
		if(root == null){
			 result[0]=0;
			 result[1]=0;
			return result;
		}
		
		int []left = maxVal(root.left);
		int []right = maxVal(root.right);
		result[0] = root.data + left[1] + right[1];
		result[1] = Math.max(left[0],left[1]) + Math.max(right[0], right[1]);
		
		return result;
	}
	
}
