package Assignment;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		for(int i=n;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
		sc.close();
		}

}
