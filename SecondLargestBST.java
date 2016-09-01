import java.util.Stack;

class NodeS{
	int level;
	int len;
	public NodeS(int level,int len){
		this.level = level;
		this.len = len;
	}
}
public class SecondLargestBST {
	public int lengthLongestPath(String input){
		if(input == null| input.length() == 0){
			return 0;
		}
		int max =0;
		String [] arr = input.split("\n");
		Stack<NodeS> stack = new Stack<NodeS>();
		for(int i = 0;i<arr.length;i++){
			String s = arr[i];
			int count = 0;
			int j = 0;
			while(j<s.length()-1){
				if(s.substring(j,j+1).equals("\t")){
					j++;count++;
				}else{
					break;
					}
				while(!stack.isEmpty() && count <=stack.peek().level){
					stack.pop();
				}
				if(s.contains(".")){
					if(stack.isEmpty()){
						max = Math.max(max, s.length()-count);
					}
					else{
						max = Math.max(max, stack.peek().len+s.length()-count);
					}
				}else {
					if(stack.isEmpty()){
						stack.push(new Node(count, s.length()-count+1));
					}else {
						stack.push(new Node(count, stack.peek().len+s.length()-count+1));
					}
				}
			}
		}
		return 0;
	}
}
