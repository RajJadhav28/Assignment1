package Assignment;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(char ch='A';ch<='E';ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		sc.close();
	}

}
