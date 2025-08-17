package Assignment3;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt(),flag=0;
		if(n==0||n==1) {
			System.out.println("Number is not prime");
		}else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println("Number is not prime");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("Number is Prime");
		}
	}
}
