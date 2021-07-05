package practical3;
import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		System.out.print("Enter three numbers for the length of each side of the triangle: ");
		Scanner input = new Scanner(System.in);
		//creating variable for each side of triangle
		input.close();
		if (input.hasNextDouble()) {
			double sideOne = input.nextDouble();
			double sideTwo = input.nextDouble();
			double sideThree = input.nextDouble();
			//calculating parameter of each side
			double parameter = sideOne + sideTwo + sideThree;
			//use boolean isValid and then put isValid in the if{} statement
			if (sideOne + sideTwo > sideThree && sideOne + sideThree > sideTwo) {
			System.out.println("The perimeter is: " + parameter);
		}
		else {
			System.out.println("You must enter a number.");
		}
	}
}
}
