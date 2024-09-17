package Assignment;

import java.util.Scanner;

public class Reverse_tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		for(int i=10;i>=1;i--) {
			int sum=n*i;
			System.out.println(sum);
		}

	}

}
