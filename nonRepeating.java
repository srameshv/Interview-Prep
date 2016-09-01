import java.util.HashMap;

public class nonRepeating {
	public static int firstUniqChar(String s) {
		HashMap<Character,Integer> nonRepeat = new HashMap<Character,Integer>();
        for(int i = 0;i<s.length();i++){
        	if(nonRepeat.containsKey(s.charAt(i))){
        		nonRepeat.put(s.charAt(i), 1+nonRepeat.get(s.charAt(i)));
        	}else {
        		nonRepeat.put(s.charAt(i),1);
        	}
        }
        for(int i = 0;i<s.length();i++){
        	if(nonRepeat.get(s.charAt(i))==1){
        		return i;
        	}
        }
        return 0;	
        }
	public static void main(String [] args){
		String s = "leetcode";
		System.out.println(firstUniqChar("leetcolde"));
	}
}