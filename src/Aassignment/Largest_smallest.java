package Aassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Largest_smallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int n=sc.nextInt();
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		int largest=Collections.max(al);
		int smallest=Collections.min(al);
		
		System.out.println("ArrayList:"+al);
		System.out.println("Smallest number:"+smallest);
		System.out.println("Largest number:"+largest);
		sc.close();
	}
}
