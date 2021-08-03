package practical5GRADED;
import java.util.Scanner;

public class q2 {
	public static void main (String[] args) {
		System.out.println("Enter a password: ");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		input.close();
		
		//calling methods to test check
		//System.out.println(checkChar(password));
		//System.out.println(checkLetterDigit(password));
		//System.out.println(checkDigits(password));
		
		//if all test passes then it will say it's a valid password.
		if (checkChar(password) && checkLetterDigit(password) && checkDigits(password)) {
			System.out.println("Valid Password.");
		}
		else {
			System.out.println("Invalid Password.");
		}
	}
	//checks password length is at least 2 characters
	public static boolean checkChar(String password) {
		return password.length() >= 2;
	}
	public static boolean checkLetterDigit(String password) {
		//default set to true
		boolean pass = true;
		String specialChar = "~!@#$%^&*()_+-=`|}{:?><\\][;/.,']\"";
		
		for (int i = 0; i < specialChar.length(); i++) {
			char special = specialChar.charAt(i);
			if (password.contains(Character.toString(special))) {
				pass = false;
			}
		}
		return pass;
	}
	public static boolean checkDigits(String password) {
		String numbers = "0123456789";
		int counter = 0;
		
		for (int i = 0; i < numbers.length(); i++) {
			char num = numbers.charAt(i);
			if (password.contains(Character.toString(num))) {
				counter++;
			}
		}
		return counter >= 3;
	}
}
