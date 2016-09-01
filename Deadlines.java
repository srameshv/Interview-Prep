
public class Deadlines {
	public static int[] tasksTypes(int[] deadlines, int day) {
	    int [] output = new int[3];
	    for(int i =0;i<3;i++){
	        output[i] = 0;
	    }
	    
	    for(int item: deadlines){
	        if(item <= day) {
	            output[0]+=1;
	        }
	        if(item < day+7){
	             output[1]+=1;
	        }
	        else {
	             output[2]+=1;
	        }
	    }
	    return output;
	}
	
	public static void main(String [] args){
		int  [] deadlines = {1,2,3,4,5};
		System.out.println(tasksTypes(deadlines,2));
	}
}
