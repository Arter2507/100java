// Calculate the circumference and area of a circle

import java.util.Scanner;

public class BaiTap {
	public static void main(String[] args) {
		double r, circumference, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of radius circle: ");
		r = sc.nextDouble();
		
		// Circumference
		circumference = 2 * Math.PI * r;
		System.out.println("Circumference of circle = " + circumference);
		System.out.println("Circumference of circle = " + Math.round(circumference));
		System.out.println("Circumference of circle = " + Math.round(circumference*100.0)/100.0);
		
		// Area of circle
		area = Math.PI * Math.pow(r , 2); //Math.pow(r , n) = r^n
		System.out.println("Are of circle = " + area);
		System.out.println("Are of circle = " + Math.round(area));
		System.out.println("Are of circle = " + Math.round(area*100.0)/100.0);
	}
}
