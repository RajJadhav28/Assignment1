package Assignment;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0;int rem;
		int temp=n;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digits of "+temp+":"+sum);
		sc.close();
	}

}
