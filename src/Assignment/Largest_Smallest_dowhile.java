package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Largest_Smallest_dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,x,max,min;
		ArrayList<Integer> al=new ArrayList<Integer>();
		do {
			System.out.println("Enter the number:");
			n=sc.nextInt();
			Integer l=n;
			
			al.add(l);
			 max=Collections.max(al);
			 min=Collections.min(al);
			 
			 //sorting the elements
			 Collections.sort(al);
			 
			
			System.out.println("Do you want to continue");
			System.out.println("Enter 1 to continue or enter 2 to discontinue or show result.");
			x=sc.nextInt();
			
		}while(x==1);
		System.out.println("Values in the list:"+al);
		System.out.println("Largest number :"+max);
		System.out.println("Smallest number:"+min);
		sc.close();
	}

}
