package Assignment;

import java.util.Scanner;

public class Sum_of_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("Sum of numbers from 1-"+n+":");
		for(int i=0;i<=n;i++) {
			sum=sum+i;
			System.out.print(sum+" ");
		}
		sc.close();
	}

}
