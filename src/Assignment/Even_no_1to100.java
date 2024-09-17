package Assignment;

import java.util.Scanner;

public class Even_no_1to100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Enter the value of n=100 you will get even no. from 1-100
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		System.out.println("Even numbers from 1-"+n+":");
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
