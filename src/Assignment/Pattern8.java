package Assignment;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			System.out.print(ch);
			ch++;
		}
			System.out.println();
		}
		sc.close();
	}

}
