package practical3;
import java.util.Scanner;
public class q2 {
	public static void main(String[] args) {
		System.out.print("Enter the vortex number: ");
		Scanner input = new Scanner(System.in);
		double length = input.nextDouble();
		input.close();
		
		if (length > 0) {
			//calculating the area of the pentagon
			double sidePentagon = 2 * length * Math.sin(Math.PI/5);
			double areaPentagon = 5 * Math.pow(sidePentagon, 2) / 4 * Math.tan(Math.PI/5);
			//printing result 
			System.out.println("The area of the pentagon is: " + areaPentagon);
		}
		else {
			System.out.println("Error. The number must be > 0");
		}
	}
}
