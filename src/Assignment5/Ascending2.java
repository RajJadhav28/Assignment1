package Assignment5;

import java.util.HashSet;
import java.util.Scanner;

public class Ascending2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet< Integer> al=new HashSet<Integer>();
		
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		
		System.out.println(al);
		sc.close();
	}
}
