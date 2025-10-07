package Aassignment;

import java.util.Scanner;

public class StrongNumber {
	public static int factorial(int  num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		return f;
	}
	public static boolean isStrong(int num) {
		int sum=0,rem, temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(isStrong(n)) {
			System.out.println(n+" is a strong number.");
		}else {
			System.out.println(n+" is not a strong number");
		}
//		for(int i=1;i<=n;i++) {
//			if(isStrong(i)) {
//				System.out.println(i);
//			}
//		}
	}
}
