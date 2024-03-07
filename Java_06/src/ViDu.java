//Input data from keyboard

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter full name: ");
		String fullName = scanner.nextLine();
		
		System.out.println("Enter student id: ");
		long studentID = scanner.nextLong();
		
		System.out.println("Enter test scores: ");
		float score = scanner.nextFloat();
		
		
		System.out.println("-------------");
		System.out.println("Full name: " + fullName);
		System.out.println("Student ID: " + studentID);
		System.out.println("Test scores: " + score);
		System.out.println("-------------");
	}
}
