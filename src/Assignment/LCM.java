package Assignment;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		int n=sc.nextInt();
		System.out.println("Enter the 2nd value:");
		int m=sc.nextInt();
		int gcd=0;
		for(int i=1;i<=n;i++) {
				if(n%i==0&&m%i==0) {
					gcd=i;
				}
		}
		System.out.println("GCD:"+gcd);
		int LCM=(n*m)/gcd;
		System.out.println("LCM:"+LCM);
		sc.close();
	}

}
