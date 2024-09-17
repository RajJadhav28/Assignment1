package Assignment;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the 1st number:");
		int n=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int m=sc.nextInt();
		
		if(n>m) {
			System.out.println(n+" is the max number.");
		}else{
			System.out.println(m+" is the max number");
		}
		}catch(Exception e) {
			System.out.println("Invalid number");
		}
		sc.close();
	}

}
