package practical2;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int years = input.nextInt();
		int population = 312032486;
		int yearSeconds = 31536000;
		input.close();
		//calculating the total additions to the current population
		int newBorn = yearSeconds / 7;
		int deaths = yearSeconds / 13;
		int newImmigrants = yearSeconds / 45;
		//adding together
		int newAdditions = + newBorn + deaths + newImmigrants * years;
		//calculating total population after input
		int finalPopulation = population + (newAdditions * years);
		//printing results
		System.out.println("Year(s) input: " + years);
		System.out.println("New Additions: " + newAdditions);
		System.out.println("Total Population before: " + population);
		System.out.println("Total Population after: " + finalPopulation);
		System.exit(0);
	}
}
