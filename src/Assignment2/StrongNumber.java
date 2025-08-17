package Assignment2;

import java.util.Scanner;

public class StrongNumber {
	public static int factorila(int num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		return f;
	}
	public static boolean isStrongNumber(int num) {
		int temp=num;
		int sum=0, rem;
		while(num>0) {
			rem=num%10;
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
			System.out.println(num+" is a Strong number");
		}else {
			System.out.println(num+" is not a Strong number");
		}
		sc.close();
	}
}
