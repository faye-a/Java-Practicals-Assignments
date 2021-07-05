package practical3;
import java.util.Scanner;
public class q6 {
	public static void main(String[] args) {
		System.out.print("Enter year: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		input.close();
		//remainder
		int remainder = year % 12;
		//making switch statements here...
		switch (remainder) {
		case 0:
			System.out.println(year + " is the year of the Monkey.");
			break;
		case 1:
			System.out.println(year + " is the year of the Rooster.");
			break;
		case 2:
			System.out.println(year + " is the year of the Dog.");
			break;
		case 3:
			System.out.println(year + " is the year of the Pig.");
			break;
		case 4:
			System.out.println(year + " is the year of the Rat.");
			break;
		case 5:
			System.out.println(year + " is the year of the Ox.");
			break;
		case 6:
			System.out.println(year + " is the year of the Tiger.");
			break;
		case 7:
			System.out.println(year + " is the year of the Rabit.");
			break;
		case 8:
			System.out.println(year + " is the year of the Dragon.");
			break;
		case 9:
			System.out.println(year + " is the year of the Snake.");
			break;
		case 10:
			System.out.println(year + " is the year of the Horse.");
			break;
		case 11:
			System.out.println(year + " is the year of the Sheep.");
			break;
		//default case will print if none of the cases is true
		default: System.out.println("There is no case for this input.");
			}
		}
	}
