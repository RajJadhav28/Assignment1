package Assignment;

import java.util.Scanner;

public class Perimiters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of length:");
		double l=sc.nextDouble();
		System.out.println("Enter the value of breadth:");
		double b=sc.nextDouble();
		double area=l*b;
		System.out.println("Area of rectangle:"+area);
		double perimiters=2*(l+b);
		System.out.println("Perimiters of rectangle:"+perimiters);
		sc.close();
	}

}
