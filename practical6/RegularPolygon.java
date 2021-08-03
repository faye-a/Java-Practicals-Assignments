package practical6GRADED;

public class RegularPolygon {
	private int n;
	private double length;
	
	//constructors
	RegularPolygon() {
		this(3, 1);
	}
	
	RegularPolygon(int n, double length) {
		this.n = n;
		this.length = length;
	}
	
	//get sides
	public int getSides() {
		return n;
	}
	
	//set sides
	public void setSides(int n) {
		if (n < 0) {
			System.out.println("Cannot accept number less than 0.");
		}
		else {
			this.n = n;
		}
	}
	
	//get length
	public double getLength() {
		return length;
	}
	
	//set length
	public void setLength(double length) {
		if (length < 0) {
			System.out.println("Cannot accept number less than 0.");
		}
		else {
			this.length = length;
		}
	}
	
	//perimeter
	public double getPerimeter() {
		return n * length;
	}
	
	//area
	public double getArea() {
		return (n * Math.pow(length, 2) / (4 * Math.tan(Math.PI/n)));
	}
	
	//string return
	@Override
	public String toString() {
		return " Number of sides: " + n + " Side length: " + length + ". ";
	}
}
