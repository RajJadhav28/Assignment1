package Assignment;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int num1=0,num2=1,num3;
		System.out.println("Fibonacci series till "+n+"th digit:");
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=n;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
		sc.close();
	}

}
