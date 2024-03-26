// Conditional Operators 

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number = ");
		int num = sc.nextInt();

		String result = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println("Num = " + num + " is " + result + " number");
	}

}
