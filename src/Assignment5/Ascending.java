package Assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ascending {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++ ) {
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		System.out.print("Sorted array:"+al+" ");
		sc.close();
	}
}
