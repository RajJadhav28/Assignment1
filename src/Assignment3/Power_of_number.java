package Assignment3;

import java.util.Scanner;

public class Power_of_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		double c;
		c=Math.pow(a, 2)+2*a*b+Math.pow(b, 2);
		System.out.println("c:"+c);
	}
}
