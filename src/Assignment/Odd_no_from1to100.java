package Assignment;

import java.util.Scanner;

public class Odd_no_from1to100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		System.out.println("Odd number from 1-"+n+":");
		for(int i=0;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
