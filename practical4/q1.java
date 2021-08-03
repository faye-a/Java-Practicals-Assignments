package practical4GRADED;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		//prompting the user to enter a number for the speed
		System.out.println("Enter your speed and acceleration. Then indicate if the runway is wet or not ('w' for wet, 'd' for dry): ");
		
		//making the scanner variable
		Scanner input = new Scanner(System.in);
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		char wetOrNot = input.next().charAt(0);
		
		//converting characters to lower-case
		char runway = Character.toLowerCase(wetOrNot);
		input.close();
		
		//formula
		double length = Math.pow(speed, 2)/(2 * acceleration);
		
		//if statement to check if run-way is wet or not
		if (runway == 'w') {
			double wetRunway = length * 0.15;
			double finalLength = wetRunway + length;
			System.out.println("The total length of the runway is: " + finalLength);
		}
		else if (runway == 'd') {
			System.out.println("The total length of the runway is: " + length); 
		}
		//error message
		else {
			System.out.println("Error. The character you entered is not valid. It must be a 'w' or 'd'. ");
			}
		}
	}
