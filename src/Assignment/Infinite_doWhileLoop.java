package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//the loop will not until the user enters 2 to stop the loop and exit or show result.
public class Infinite_doWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,x=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		do {
		System.out.println("Enter the number:");
		n=sc.nextInt();
		Integer l=n;
		al.add(l);
		
		Collections.sort(al);
		
		System.out.println("Do you want to continue");
		System.out.println("Enter 1 to continue or enter 2 to discontinue or show result.");
		x=sc.nextInt();
		}while(x==1);
		System.out.println("Values in the list:"+al);
		sc.close();
	}

}
