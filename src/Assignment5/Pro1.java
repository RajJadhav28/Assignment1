package Assignment5;

import java.util.Scanner;

public class Pro1 {
	public static int[] ascending(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
		}
		int result[]=ascending(arr);
		for(int num:result) {
			System.out.print(num+" ");
		}
		sc.close();
	}
	
}
