
// Basic operations in java
import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		// declare variable
		int num1, num2;

		// Input data

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value num1 = ");
		num1 = sc.nextInt();
		System.out.println("Enter value num2 = ");
		num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("Summation of " + num1 + " + " + num2  + " = " + sum);
		
		int sub = num1 - num2;
		System.out.println("Subtraction of " + num1 + " - " + num2  + " = " + sub);
		
		int mul = num1 * num2;
		System.out.println("Multiplication of " + num1 + " * " + num2  + " = " + mul);
		
		float div = (float)num1 / num2;
		System.out.println("Division of " + num1 + " / " + num2  + " = " + div);
		
		float modulus = (float)num1 % num2;
		System.out.println("Modulus of " + num1 + " / " + num2  + " = " + modulus);
	}
}
