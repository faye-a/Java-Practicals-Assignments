package practical3;
import java.util.Scanner;
public class q5 {
	public static void main(String[] args) {
		System.out.print("Enter a lowercase or uppercase letter: ");
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);
		input.close();
		char c = Character.toLowerCase(ch);
		//use boolean isValid again instead of putting all of it in the if statement
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
			System.out.println(ch + " is a vowel");
		}
        else {
        	 System.out.println(ch + " is a consonant");
        }
	}
}
