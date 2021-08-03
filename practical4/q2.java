package practical4GRADED;
import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		//asking user for input
		System.out.println("Enter a year and a month: ");
		Scanner input = new Scanner(System.in);
		
		//declaring input variables
		int year = input.nextInt();
		int month = input.nextInt();
		input.close();
		//can also use case statements for this question
		//using if statement if the month is an odd number
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31 days.");
		}
		else if (month == 4 || month == 6 || month == 9 || month == 1) {
			System.out.println("30 days");
		}
		else if(month == 2) {
			//checking if the year is a leap year
			if(year % 4 == 0) {
				System.out.println("29 days.");
			}
			else if(year % 100 == 0) {
				System.out.println("29 days.");
			}
			else if(year % 400 == 0) {
				System.out.println("29 days.");
			}
			else {
				System.out.println("28 days.");
			}
		}
		//error message goes here
		else {
			System.out.println("Error. The month you entered needs to be between 1-12.");
		}
	}
}
