package Assignment4;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isPerfect(int num) {
		int sum=0;int temp=num;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return temp==sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("Perfect number from 1-"+n+":");
		for(int i=1;i<=n;i++) {
			if(isPerfect(i)) {
				System.out.println(i);
			}
		}
//		if(isPerfect(n)) {
//			System.out.println(n+" is a perfect number");
//		}else {
//			System.out.println(n+" is not a perfect number");
//		}
		sc.close();
	}
}
