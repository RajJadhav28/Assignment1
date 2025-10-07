package Patterns;

import java.util.Scanner;

public class Pro3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		c++;
		System.out.println("---"+c+"---");
		System.out.println("Enter the value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)('A'+i));
			}
			System.out.println();
		}
		c++;
		System.out.println("---"+c+"---");
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
	}
}
