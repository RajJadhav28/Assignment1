package Aassignment;

import java.util.Scanner;

public class perfectNumber1_100 {
	public static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return num==sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Perfect number from 1 -"+num+":");
		for(int i=1;i<=num;i++) {
		if(isPerfect(i)) {
			System.out.println(i);
		}
	}
		sc.close();
	}
}
