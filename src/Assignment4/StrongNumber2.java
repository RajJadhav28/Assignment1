package Assignment4;

import java.util.Scanner;

public class StrongNumber2 {
	public static int factorial(int num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		return f;
	}
	public static boolean isStrong(int num) {
		int rem, sum=0; 
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		return temp==sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(isStrong(i)) {
				System.out.println(i);
			}
		}
//		if(isStrong(n)) {
//			System.out.println("Strong number");
//		}else {
//			System.out.println("Not a strong number");
//		}
//		sc.close();
	}
}
