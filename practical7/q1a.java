package practical7GRADED;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class q1a {
	public static void main (String[] args) throws IOException {
		//Creating file reader using Scanner
		File text = new File(args[0]);
		Scanner file = new Scanner(text);
		
		int charCount = 0;
		int charCountWhiteSpace = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		
		
		//While loop to check for character count, line count and word count
		String line;
		while (file.hasNextLine()) {
			line = file.nextLine();
			
			//Counting characters including whitespace
			charCountWhiteSpace += line.length();
			
			//Counting lines
			lineCount += 1;
			
			//Counting characters excluding whitespace
			for (int i = 0; i < line.length(); i++) {
				if (Character.isWhitespace(line.charAt(i)) == false) {
					charCount += 1;
				}
			}
			
			//Counting total words
			String[] words = line.split("\\s+");
	        wordCount += words.length;
		}
		
		
		//Printing out results
		System.out.println("Total number of characters including whitespace: " + charCountWhiteSpace);
		System.out.println("Total number of characters excluding whitespace: " + charCount);
		System.out.println("Total word count: " + wordCount);
		System.out.println("Total line count: " + lineCount);
	}
}
