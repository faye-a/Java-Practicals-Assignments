package practical2;
import java.util.Scanner;

public class q6 {
	public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        //takes the remainder
        int firstDigit = num % 10;
        //removes the smallest unit of number 
        int remainingNumber = num / 10;
        //takes the remainder
        int SecondDigit = remainingNumber % 10;
        //removes the smallest unit of number
        remainingNumber = remainingNumber / 10;
        //takes the remainder
        int thirdDigit = remainingNumber % 10;
        //removes the smallest unit of number
        remainingNumber = remainingNumber / 10;
        //takes the remainder
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);

    }
}
