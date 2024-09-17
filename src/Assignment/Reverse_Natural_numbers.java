package Assignment;

import java.util.Scanner;

public class Reverse_Natural_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		System.out.println("Natural numbers:");
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}

	}

}
