package Assignment;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();

	}

}
