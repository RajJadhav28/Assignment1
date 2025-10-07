package Patterns;

import java.util.Scanner;

public class Pro4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		c++;
		System.out.println("---"+c+"---");
		if(!Character.isLetter(ch)) {
			System.out.println("Invalid input!!!");
			return;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(ch+i));
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=0;i<n;i++) {
			for(int j=0;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print((char)(ch+i));
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=n;i>=0;i--) {
			for(int j=0;j<=i;j++) {
//				System.out.print((char)(ch+i));
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=n;i>=0;i--) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=n;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=0;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print((char)(ch+j));
			}
			for(int j=i-1;j>=0;j--) {
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
	}
	
	
}
