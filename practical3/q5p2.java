package practical3;

public class q5p2 {
	public static void main(String[] args) {
		
		//for (int i=0; i<10;i++) {
			//double r = Math.random();
			//throw away the decimal point
			//what if we don't want to start at 0
			//int k = (int) (r*10.0);
			//System.out.println(k);
		//}
		int a = 50;
		int b = 99;
		
		double r = 0.9999;
		int x = a + (int) (r*b);
		double x2 = a + (r*b);
		System.out.println(x);
		System.out.println(x2);
		
	}
}