package practical5GRADED;
import java.util.Scanner;

public class q3 {
	public static void main (String[] args) {
		System.out.println("Enter the result: ");
		String scores;
		
		Scanner input = new Scanner(System.in);
		while (input != null) {
		scores = input.nextLine();
		
		//converting variable.
		String upperResults = scores.toUpperCase();
		if (checkString(upperResults) && checkSpecial(upperResults) && checkOtherStr(upperResults)) {
			int totalScore = checkDW(upperResults);
			int avScore = totalScore/scores.length();
			
			//printing results and breaking the loop.
			System.out.println("Total Score: " + totalScore);
			System.out.println("Average Points: "+ avScore);
			break;
			}
		//goes out of the if statement if it's false. And the while loop continues.
		System.out.println("Invalid Format. Try again.");
		}
		input.close();
	}
	//adds 3 to score
	public static int addW() {
		return 3;
	}
	//adds 1 to score
	public static int addD() {
		return 1;
	}
	//checks if string has W D or L
	public static boolean checkString (String line) {
		boolean flag = false;
		String letters = "WDL";
		//for loop
		if (checkSpecial(line)) {
			for (int i = 0; i < letters.length(); i++) {
				char indLetter = letters.charAt(i);
				if (line.contains(Character.toString(indLetter))) {
					flag = true;
				}
			}
		}
		return flag;
	}
	//checks if the WD is W or D, then calls the methods to add to the score
	public static int checkDW (String string) {
		int score = 0;
		for (int j = 0; j < string.length(); j++) {
			if (string.charAt(j) == 'W') {
				//System.out.println('w');
				score += addW();
			}
			if (string.charAt(j) == 'D') {
				//System.out.println('d');
				score += addD();
			}
		}
		return score;
	}
	//checks if it has any special characters
	public static boolean checkSpecial (String string) {
		boolean flag = true;
		String special = "~!@#$%^&*()_+`-={}|:<>?[]\\;',./'\"";
		for (int i = 0; i < special.length(); i++) {
			char c = special.charAt(i);
			if (string.contains(Character.toString(c))) {
				//System.out.println("here");
				flag = false;
			}
		}
		return flag;
	}
	//checks if it has any other characters that shouldn't be in the string.
	public static boolean checkOtherStr (String string) {
		boolean flag = true;
		String other = "qertyuiopasfghjkzxcvbnmQERTYUIOPASFGHJKZXCVBNM";
		
		for (int i = 0; i < other.length(); i++) {
			char c = other.charAt(i);
			if (string.contains(Character.toString(c))) {
				//System.out.println("here in string");
				flag = false;
			}
		}
		return flag;
	}
}
