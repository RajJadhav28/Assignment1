package Assignment2;

import java.util.Scanner;

public class PrimeNumber2 {
	public static boolean isPrime(int n) {
		int flag=0;
		if(n==0||n==1) {
			return false;
		}else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
					
				}
			}
		}
			return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=3;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}
	}
}
