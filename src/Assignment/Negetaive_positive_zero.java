package Assignment;

import java.util.Scanner;

public class Negetaive_positive_zero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the 1st number:");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("Positive number:"+n);
		}else if(n<0) {
			System.out.println("Negative number:"+n);
		}else {
			System.out.println("Number is zero:"+n);
		}
		}catch(Exception e) {
			System.out.println("Invalid number");
		}
		sc.close();

	}

}
