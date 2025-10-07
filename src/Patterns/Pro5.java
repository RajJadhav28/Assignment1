package Patterns;

import java.util.Scanner;

public class Pro5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		c++;
		System.out.println("---"+c+"---");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		sc.close();
		}
	
	
}
