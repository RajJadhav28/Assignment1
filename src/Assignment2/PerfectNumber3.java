package Assignment2;

import java.util.Scanner;

public class PerfectNumber3 {
	public static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
				System.out.println(sum);
			}
		}
		return sum==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(isPerfect(n)) {
			System.out.println("Perfect number:"+n);
		}else {
			System.out.println("Not Perfect:"+n);
		}
	}
}
