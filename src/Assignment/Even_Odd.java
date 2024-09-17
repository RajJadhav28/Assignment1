package Assignment;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the value:");
			int n=sc.nextInt();
			if(n%2==0) {
				System.out.println(n+" is even number.");
			}else {
				System.out.println(n+" is a odd nuber.");
			}
		}catch(Exception e) {
			System.out.println("Invalid input");
		}
		sc.close();
	}

}
