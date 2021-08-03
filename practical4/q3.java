package practical4GRADED;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userNumber = 0;
		
		//declaring random number
		int max = 100;
		int min = 1;
		int randomNumber = min + (int) (Math.random() * ((max - min) + 1));
		
		//while loop to check if the number of the user matches the random number generated
		while (userNumber != randomNumber) {
				System.out.println("Enter a number: ");
				userNumber = input.nextInt();
				if (userNumber < randomNumber) {
				System.out.println("Too low.");		
				}
				else if (userNumber > randomNumber) {
				System.out.println("Too high");
				}
				else {
				System.out.println("Correct!");
			}
		}
		input.close();
	}
}
