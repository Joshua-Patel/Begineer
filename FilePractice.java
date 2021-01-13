import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;

public class FilePractice{

	public static void main(String[] args) throws Exception{
		
		File cDir = new File(".");
		System.out.println(cDir.getAbsolutePath());
		
		PrintWriter pw = new PrintWriter("pw.txt");
		pw.println("This is a test.");
		pw.close();
		
		File myFile = new File("gib.txt");
		
		Scanner in = new Scanner(myFile);
		
		ArrayList<String> words = new ArrayList<>();
		
		while (in.hasNext()){
			String word = in.next();
			words.add(word);
		}
		in.close();
		
		/*
		for(int i=0; i<words.size(); i++) {
			System.out.println(words.get(i));
		}
		*/
		
		for (String s : words){
			System.out.println(s);
		}
	}
}