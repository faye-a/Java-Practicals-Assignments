package practical2;

import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declaring input as variables
		double distance = input.nextDouble();
		double fuelEff = input.nextDouble();
		double price = input.nextDouble();
		input.close();
		//calculating the cost
		double totalCost = (distance / fuelEff) * price;
		//printing results..
		System.out.println("The total cost of the trip: " + totalCost);
		System.exit(0);
	}
}
