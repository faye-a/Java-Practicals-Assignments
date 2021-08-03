package practical6GRADED;

public class testPolygon {
	public static void main(String[] args) {
		//creating an array that has 4 regularpolygon objects
		RegularPolygon[] polygon = new RegularPolygon[4];
		polygon[0] = new RegularPolygon(3, 10.0);
		polygon[1] = new RegularPolygon(6, 7.5);
		polygon[2] = new RegularPolygon(8, 3.5);
		polygon[3] = new RegularPolygon(12, 4.0);
		
		//printing info for each polygon object using a for loop
		for (int j = 0; j < polygon.length; j++) {
			int number = j + 1;
			double area =  Math.round(polygon[j].getArea() * 100.0) / 100.0;
			System.out.println("Polygon " + number + ": " + polygon[j].toString() + " Area: " + area + " Perimeter: " + polygon[j].getPerimeter()); 
		}
		
		//intializing variables
		int perObj = 0;
		int areaObj = 0;
		double smallestPerimeter = polygon[0].getPerimeter();
		double largestArea = polygon[0].getArea();
		
		//for loop to go through each object and check for smallest perimeter and largest area
		for (int i = 1; i < polygon.length; i++) {
			if (polygon[i].getPerimeter() < smallestPerimeter) {
				smallestPerimeter = polygon[i].getPerimeter();
				perObj = i;
			}
			if (polygon[i].getArea() > largestArea) {
				largestArea = polygon[i].getArea();
				areaObj = i;
			}
		}
		
		//printing out results
		System.out.println("\nThe smallest perimeter is Polygon " + (perObj + 1) + "," + polygon[perObj].toString() + " with a perimeter of: " + smallestPerimeter);
		System.out.println("The largest area is Polygon " + (areaObj + 1) + "," + polygon[areaObj].toString() + (areaObj + 1) + " with an area of: " + Math.round(largestArea * 100.0) / 100.0);
		
		
//		testing if the object's length stays the same when a negative number is attempted to set the length or sides
//		System.out.println("\n");
//		RegularPolygon x = new RegularPolygon(3, 10);
//		x.setLength(-1);
//		x.setSides(-2);
//		System.out.println(x.toString());
	}
}
