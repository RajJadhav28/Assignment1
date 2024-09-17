package Assignment;

import java.util.Scanner;

public class Power_of_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("Enter the power:");
		int n1=sc.nextInt();
		double c=Math.pow(n, n1);
		System.out.println(c);
		sc.close();
	}

}
