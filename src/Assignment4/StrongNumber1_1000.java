package Assignment4;

import java.util.Scanner;

public class StrongNumber1_1000 {
	public static int factorial(int num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		return f;
	}
	public static boolean isStrongNumber(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number:");
		int n=sc.nextInt();
		System.out.println("Strong number from 1 -"+n+" :");
		for(int i=1;i<=n;i++) {
			if(isStrongNumber(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
