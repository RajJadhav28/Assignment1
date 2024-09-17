package Assignment;

import java.util.Scanner;

public class Maximum2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the 1st number:");
		int n=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int m=sc.nextInt();
		System.out.println("Enter the 3rd number:");
		int k=sc.nextInt();
		
		if(n>m&&n>k) {
			System.out.println(n+" is the max number.");
		}else if(m>n&&m>k){
			System.out.println(m+" is the max number");
		}else {
			System.out.println(k+" is the max number");
		}
		}catch(Exception e) {
			System.out.println("Invalid number");
		}
		sc.close();

	}

}
