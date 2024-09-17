package Assignment;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int sum=n*i;
			System.out.println(sum);
		}

	}

}
