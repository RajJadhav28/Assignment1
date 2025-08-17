package Assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Asecnding_Order {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter the array elements:");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("Ascending order:");
		 Arrays.sort(arr);
		 for(int i:arr) {
			 System.out.print(i+" ");
		 }
		 List<Integer>list=new ArrayList<Integer>();
		 for(int num:arr) {
			 list.add(num);
		 }
		 Collections.reverse(list);
		 LinkedHashSet<Integer> uniqueSet=new LinkedHashSet<Integer>(list);
		 System.out.println("\nDescending order:");
		 for(int num:uniqueSet) {
			 System.out.print(num+" ");
		 }
	}
}
