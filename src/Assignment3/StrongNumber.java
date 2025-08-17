package Assignment3;

import java.util.Scanner;

public class StrongNumber {
	public static int factorila(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static boolean isStrongNumber(int num) {
		int  sum=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			sum=sum+factorila(rem);
			num=num/10;
		}
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(isStrongNumber(num)) {
			System.out.println("Strong number");
		}else {
			System.out.println("Not a strong number.");
		}
	}
	
}
