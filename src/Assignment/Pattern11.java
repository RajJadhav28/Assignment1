package Assignment;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)('A'+i));
			}
			System.out.println();
		}
		sc.close();
	}

}
