package Assignment;

import java.util.Scanner;

public class Natural_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		System.out.println("Natural numbers:");
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
