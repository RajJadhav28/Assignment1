package Assignment;

import java.util.Scanner;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int c=0;
		System.out.println("Duplicate elements:");
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				c++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("No.of duplicate elements:"+c);
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j++]=arr[arr.length-1];
		System.out.println("Array after removing the duplicate elements:");
		for(int i=0;i<j;i++) {
			System.out.print(temp[i]+" ");
			
		}
		sc.close();
	}

}
