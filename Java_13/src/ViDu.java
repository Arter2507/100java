// Math class

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number a = ");
		a = sc.nextDouble();
		System.out.println("Enter number b = ");
		b = sc.nextDouble();

		// abs method
		System.out.println("Absolute value of number a = " + Math.abs(a));

		// min method
		System.out.println("Value min of number = " + Math.min(a, b));

		// max method
		System.out.println("Value max of number = " + Math.max(a, b));

		// ceil method
		System.out.println("Ceil(a) = " + Math.ceil(a));

		// floor method
		System.out.println("Floor(a) = " + Math.floor(a));

		// square root method
		System.out.println("Square root of number a = " + Math.sqrt(a));
		
		// a^b method
		System.out.println("a^b = " + Math.pow(a,b));
	}
}
