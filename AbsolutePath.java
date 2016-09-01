import java.io.File;

public class AbsolutePath {

	public static void main(String [] args){
		int sum = 0;
		File file = new File("C:\\Users\\Sruthi\\OneDrive\\iPhone Photo\\100APPLE");
		File [] listOfFiles = file.listFiles(); 
		//System.out.println("Length -");
		for(int i=0;i<listOfFiles.length;i++){
			if(listOfFiles[i].isFile() && listOfFiles[i].getName().endsWith("JPG")){
				//System.out.println("Image files"+listOfFiles[i].getName());
				sum += listOfFiles[i].getAbsolutePath().length();
//				System.out.println(//"LEGTH-"+listOfFiles[i].getAbsolutePath().length());
			}
		}
		System.out.println("Length of the image\t"+sum);
	}
}
