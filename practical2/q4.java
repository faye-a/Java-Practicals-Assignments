package practical2;
import java.util.Scanner;
public class q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//creating variables for inputs
		double ta = input.nextDouble();
		double v = input.nextDouble();
		input.close();
		
		if (ta > -58 && ta < 41) {
			if (v >= 2) {
				double twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta) * (Math.pow(v, 0.16));
				//printing results
				System.out.println("The wind-chill temperature: " + twc);
			}
		}
		//else statement for the error message
		else {
			System.out.println("Error. Something was wrong with your input.");
		}
		System.exit(0);
	}
}
