/*Find the longest consecutive sequence in a tree path*/
class Solution {
	public int longestConsecutive(Node root){
		if(root == null ){
			return -1;
		}
		 return longestConsecutive(root,0, root.data + 1);
	}
	public int longestConsecutive(Node root, int curLen, int target){
		if(root == null){
			return 0;
		}
		if(root.data == target){
			curLen +=1;
		}
		else {
			curLen =1;
		}
		int left = longestConsecutive(root.left, curLen, root.data+1);
		int right = longestConsecutive(root.right, curLen, root.data+1);
		return Math.max(curLen, Math.max(left, right));
		
	}
}

ca