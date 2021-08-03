package practical4GRADED;
import java.util.*;

public class q4 {
	public static void main(String[] args) {
		System.out.print("Enter two strings to compare: ");
		
		//input section
		Scanner input = new Scanner(System.in);
		String string1 = input.nextLine();
		String string2 = input.nextLine();
		input.close();
		
		//starting if statements to see if 1. start of string matches
		// 2. if the length of string is less than the other string
		// 3. for loop to then go through each index and find the matching characters and putting them into matchingPrefix
		String matchingPrefix = "";
		
		if (string1.charAt(0) == string2.charAt(0) || string2.charAt(0) == string1.charAt(0)) {
			if (string1.length() < string2.length()) {
				for (int i = 0; i < string1.length(); i++) {
					if (string1.charAt(i) == string2.charAt(i)) {
						matchingPrefix += string1.charAt(i);
					}
				}
				System.out.print(matchingPrefix);
			}
			else if (string1.length() > string2.length()) {
				for (int i = 0; i < string2.length(); i++) {
					if (string1.charAt(i) == string2.charAt(i)) {
						matchingPrefix += string1.charAt(i);
					}
				}
				System.out.print(matchingPrefix);
			}
		}
		else {
			System.out.print("There are no matching prefixes.");
		}
	}
}
