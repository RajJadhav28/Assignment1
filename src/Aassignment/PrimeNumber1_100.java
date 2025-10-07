package Aassignment;

import java.util.Scanner;

public class PrimeNumber1_100 {
	public static boolean isPrime(int num) {
		
		if(num==0|| num==1) {
			return false;
		}else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		isPrime(num);
		for(int i=1;i<num;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
