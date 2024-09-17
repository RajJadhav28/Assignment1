package Assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();int flag=0;
		if(n==0||n==1) {
			System.out.println("Not a Prime number.");
		}else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println("Not a Prime number");
					flag=1;
					break;
				}
			}
			
		}
		if(flag==0) {
			System.out.println("Number is Prime.");
		}
	}

}
