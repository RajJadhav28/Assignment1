package Assignment;

import java.util.Scanner;

public class PrimNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();int flag=0,c=0;
		if(n==0||n==1) {
			System.out.println("Not a prime number:");
		}else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println("Not a prime no.");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("Prime no.");
		}
	}

}
