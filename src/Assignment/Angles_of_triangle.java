package Assignment;

import java.util.Scanner;

public class Angles_of_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st angle:");
		int a1=sc.nextInt();
		System.out.println("Enter the 2nd angle:");
		int a2=sc.nextInt();
		System.out.println("Enter the 3rd angle:");
		int a3=sc.nextInt();
		if(a1+a2+a3==180) {
			System.out.println("It's a triangle");
		}else {
			System.out.println("Not a triangle");
		}
		sc.close();
	}

}
