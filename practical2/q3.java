package practical2;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//setting variables for the inputs
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y1 = input.nextDouble();
		double y2 = input.nextDouble();
		input.close();
		//computing the distance
		double forSqRt = (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2));
		double SqRt = Math.sqrt(forSqRt);
		
		System.out.println("The square root: " + SqRt);
		System.exit(0);
	}
}
