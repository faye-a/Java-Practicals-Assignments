package practical2;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		Scanner inputNew = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = inputNew.nextDouble();
		double length = inputNew.nextDouble();
		inputNew.close();
		
		double area = Math.pow(radius, 2) * Math.PI;
		double volume = area * length;
		
		System.out.println("The radius: " + radius);
		System.out.println("The length: " + length);
		System.out.println("Area: " + area);
		System.out.println("Volume: " + volume);
		System.exit(0);
	}
}
