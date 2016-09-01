import java.util.LinkedList;

public class PreOrderSerialization {
	public boolean isValidSerialization(String preOrder){
		LinkedList<String> stack = new LinkedList<String>();
		String [] arr = preOrder.split(",");
		for(int i = 0;i< arr.length;i++){
			stack.add(arr[i]);
			while(stack.size()>=3 && stack.get(stack.size() -1)=="#" && stack.get(stack.size() -2)=="#" &&  stack.get(stack.size() -3)!="#"){
				
			}
		}
		return false;
		
	}

}
