package Assignment;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=n;i>=1;i--) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
