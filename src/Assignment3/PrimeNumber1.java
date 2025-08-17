package Assignment3;

import java.util.Scanner;

public class PrimeNumber1 {
	public static boolean isPrime(int num) {
		int flag=0;
		if(num==0||num==1) {
			return false;
//			System.out.println("Not a prime number!!!");
		}else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
//					System.out.println("Not a prime number.");
//					flag=1;
//					break;
					return false;
				}
			}
		}
		if(flag==0) {
//			System.out.println("Prime number.");
			return true;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("Prime number from 1 to "+n+":");
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
