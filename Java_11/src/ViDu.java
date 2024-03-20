//Comparative and conditional

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.println("Enter value a = ");
		a = sc.nextInt();
		System.out.println("Enter value b = ");
		b = sc.nextInt();

		// Result comparative
		System.out.println(a + " = " + b + " : " + (a == b));
		System.out.println(a + " != " + b + " : " + (a != b));
		System.out.println(a + " > " + b + " : " + (a > b));
		System.out.println(a + " < " + b + " : " + (a < b));
		System.out.println(a + " >= " + b + " : " + (a >= b));
		System.out.println(a + " <= " + b + " : " + (a <= b));

		// Result conditional
		System.out.println("----------------");
		System.out.println("Both number are even number: " + (a % 2 == 0 && b % 2 == 0));
		System.out.println("Has at least 1 even number: " + (a % 2 == 0 || b % 2 == 0));
	}
}
