package Assignment;

import java.util.Scanner;

public class AbsoluteNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int abs=Math.abs(n);
		System.out.println("The absolute value of "+n+" is "+abs);
		sc.close();
	}

}
