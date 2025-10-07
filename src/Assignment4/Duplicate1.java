package Assignment4;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicate1 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the array length:");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter the array elements:");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int duplicate=0;
		 HashSet<Integer> allElements=new HashSet<Integer>();
		 HashSet<Integer>duplicateElements=new HashSet<Integer>();
		 HashSet<Integer>uniqueElements=new HashSet<Integer>();
		 
		 for(int num:arr) {
			 if(!allElements.add(num)) {
				 duplicateElements.add(num);
				 duplicate++;
				 uniqueElements.remove(num);
			 }else {
				 uniqueElements.add(num);
			 }
		 }
		 System.out.println("Duplicate Elements:"+duplicateElements);
		 System.out.println("No.of duplicate Elements:"+duplicate);
		 System.out.println("Unique Elements:"+uniqueElements);
		 System.out.println("Array after removing duplicate elements:"+allElements);
		 sc.close();
	}
}
