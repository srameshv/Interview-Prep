import java.util.Arrays;

public class kSmallest {
	public static int kthSmallest(int[][] matrix, int k) {
		int [] arr = new int[matrix.length * matrix[0].length];
		int index =0;
		for(int i =0;i<matrix.length; i++){
			for(int j=0;j<matrix[0].length;j++){
				arr[index]=matrix[i][j];
				index++;
			}
		}
		Arrays.sort(arr);
		for(int l=0;l<arr.length;l++){
			System.out.println(arr[l]);	
		}
		return arr[k-1];
    }
	public static void main(String [] args){
		//int [][]matrix = {{ 1,  5,  9},{10, 11, 13},{12, 13, 15}};
		int [][]matrix = {{ 1,2},{1,3}};
		System.out.println("ELEMENT"+kthSmallest(matrix,2));
	}
}
