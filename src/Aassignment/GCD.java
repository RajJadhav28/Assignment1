package Aassignment;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int n=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int m=sc.nextInt();
		int gcd=0;
		int min=Math.min(n, m);
		
		for(int i=1;i<=min;i++) {
			if(n%i==0 && m%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD:"+gcd);
		int LCM=n*m/gcd;
		System.out.println("LCM:"+LCM);
		sc.close();
	}
}
