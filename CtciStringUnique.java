import java.util.Hashtable;

//Time complexity will be O(n^2)
/*
public class CtciStringUnique {
	private static void checkUnique(String checkString) {
		for(int i = 0; i < checkString.length(); i++) {
			for(int j = i+1; j<checkString.length(); j++) {
				if(checkString.charAt(i) ==  checkString.charAt(j)) {
					System.out.println("String doesn't have unique characters");
					return;
				}
			}
		}
		System.out.println("String has unique characters");
	}
	public static void main(String [] args) {
		String myString  = "GreenLands";
		checkUnique(myString);
	}
}
*/
//Time complexity
/*
public class CtciStringUnique {
	private static void checkUnique(String checkString) {
		boolean unique = false;
		for(char c : checkString.toCharArray()) {
			System.out.println("UNIQUE"+unique);
			if(checkString.indexOf(c)== checkString.lastIndexOf(c)) {
				System.out.println("STRING"+"\t"+ c+checkString.indexOf(c)+"\t"+checkString.lastIndexOf(c));
				unique = true;	
			}
			else {
				unique = false;
				break;
			}
		}
		System.out.println("UNIQUE"+unique);
		if(unique == true){
			System.out.println("String has unique characters");
		}
		else {
			System.out.println("String doesnt have  unique characters");
		}
	}
	public static void main(String [] args) {
		String myString  = "fre";
		checkUnique(myString);
	}	
}
*/
/*
public class CtciStringUnique {
	public static void main(String [] args) {
		  String s = "abca";
		        if (s == null || s.isEmpty()){
		        	System.out.println("Empty");
		        }
		        char prev = s.charAt(0);
		        int cnt = 1;
		        StringBuffer sb = new StringBuffer();
		        sb.append(prev);
		        for (int i = 1; i < s.length(); ++i) {
		            char curr = s.charAt(i);
		            if (curr == prev) {
		                ++cnt;
		            } else {
		                prev = curr;
		                sb.append(cnt)
		                  .append(curr);
		                cnt = 1;
		            }
		        }
		        sb.append(cnt);
		        if(sb.toString().length() >= s.length()){
		        	System.out.println("Output\t" + s);
		        }
		        else { 
		        	System.out.println("Output\t" +sb.toString());
		        }   
		    }
	}
	*/

public class CtciStringUnique {
	public static void main(String [] args) {
		
	}
}
