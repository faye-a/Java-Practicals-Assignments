package practical5GRADED;
import java.util.Scanner;

public class q1 {
	public static void main (String[] args) {
		//prompts user for input, create input variables as doubles, calls method which prints out the values according to the years.
		System.out.println("Enter an investment amount & an annual percentage interest rate: ");
		Scanner input = new Scanner(System.in);
		double amount = Math.round(input.nextDouble() * 100.0) / 100;
		double percent = Math.round(input.nextDouble() * 100.0) / 100;
		input.close();
		
		//check if amount and percent are not negative numbers.
		if (amount > 0 && percent > 0) {
			eachValueYearly(amount, percent);
		}
		else {
			System.out.println("Sorry, you entered a negative number. Exiting program..");
		}
	}
	//doesn't return anything.
	public static void eachValueYearly(double amount, double monthlyRate) {
		//year starts at one and ends at 30.
		int year = 1;
		double value = 0;
		
		System.out.println("Year" + " " + "Value");
		//calls futureValue each time in the loop
		while (year <= 30) {
			value = Math.round(futureValue(amount, monthlyRate, year) * 100.00) / 100.0;
			System.out.println(year + "  " + value);
			year++;
		}
	}
	public static double futureValue(double amount, double monthlyRate, int years) {
		double futureVal = amount * (Math.pow((1 + (monthlyRate/1200)), years*12));
		return futureVal;
	}
}
