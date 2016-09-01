import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Write a program to break up the words into appropriate spaces*/

public class MakeWords {
	public static Set<String> wordList = new HashSet<String>();

	
	private static void generateWords(String words){
		StringBuilder wordBuilder = new StringBuilder();
		wordBuilder.append(words);
		//wordBuilder.trimToSize();
		System.out.println("The String is wordBuilder\t"+wordBuilder.toString());
		StringBuilder sb = new StringBuilder();
		
		if(words == null){
			System.out.println("The String is empty");
		}
		if(words.length()==1){
			System.out.println("Correct String is :"+ words);
		}
		
		for (Iterator<String> it = wordList.iterator(); it.hasNext(); ) {
			String s = it.next();
			
			if(words.toLowerCase().contains(s.toLowerCase())) {
				sb.append(s);
				sb.append(" ");
				System.out.println("S="+words.indexOf(s));
				wordBuilder.delete(words.indexOf(s), words.indexOf(s)+s.length());
				words = wordBuilder.toString();
			}
		}
		System.out.println("THE STRING IS "+sb.toString());
	}
	public static void main(String [] args){

		wordList.add("Peanut");
		wordList.add("Butter");
		wordList.add("Jelly");
		wordList.add("Slippers");
		wordList.add("Mellow");
		wordList.add("I");
		wordList.add("am");
		wordList.add("doing");
		wordList.add("well");
		
		//String words = "Pea nutButterJelly Mellow";
		String words = "iamdoingwell";
		generateWords(words);
	}
	
}