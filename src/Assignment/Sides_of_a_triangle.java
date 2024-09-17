package Assignment;

import java.util.Scanner;

public class Sides_of_a_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first side:");
		int s1=sc.nextInt();
		System.out.println("Enter the second side:");
		int s2=sc.nextInt();
		System.out.println("Enter the third side:");
		int s3=sc.nextInt();
		if((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1)) {
			System.out.println("It's is triangle");
		}else {
			System.out.println("Not a triangle");
		}
		sc.close();
	}

}
