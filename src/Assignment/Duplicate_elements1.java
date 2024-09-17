package Assignment;

import java.util.Scanner;

public class Duplicate_elements1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		boolean isduplicate[]=new boolean[s];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate element:"+arr[i]);
					isduplicate[i]=true;
					isduplicate[j]=true;
					break;
				}
			}
		}
		System.out.println("Unique elements:");
		for(int i=0;i<arr.length;i++) {
			if(!isduplicate[i]) {
				System.out.println(arr[i]);
			}
		}

	}

}
