package Assignment3;

import java.util.Scanner;

public class PerfectNumber1 {
	public static boolean isPrefect(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return sum==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("Perfect number from 1 to "+n+":");
		for(int i=1;i<=n;i++) {
			if(isPrefect(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
