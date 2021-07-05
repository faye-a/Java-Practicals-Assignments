package practical3;
import java.util.Scanner;
public class q3 {
	public static void main(String[] args) {
		System.out.println("Please enter a pair of coordinates (seperately): ");
		Scanner input = new Scanner(System.in);
		double coordinateOne = input.nextInt();
		double coordinateTwo = input.nextInt();
		input.close();
		//creating the width and height of the rectangle
		double width = 5;
		double height = 2.5;
		if (Math.abs(coordinateOne) <= Math.abs(width) && Math.abs(coordinateTwo) <= Math.abs(height)) {
			System.out.println("The coordinates (" + coordinateOne + "," + coordinateTwo + ") is inside the rectangle.");
		}
		else {
			System.out.println("Error. The coordinates (" + coordinateOne + "," + coordinateTwo + ") is outside the rectangle.");
		}
	}
}
