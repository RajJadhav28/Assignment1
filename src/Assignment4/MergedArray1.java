package Assignment4;

import java.util.Scanner;

public class MergedArray1 {
	public static int []merge(int arr1[], int arr2[]) {
		int n1=arr1.length;
		int n2=arr2.length;
		int mergedArray[]=new int[n1+n2];
		int i=0,j=0,k=0;
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				mergedArray[k++]=arr1[i++];
			}else {
				mergedArray[k++]=arr2[j++];
			}
		}
		while(i<n1) {
			mergedArray[k++]=arr1[i++];
		}
		while(j<n2) {
			mergedArray[k++]=arr2[j++];
		}
		return mergedArray;
	}
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the length of 1st array:");
		int n=sc.nextInt();
		System.out.println("Enter the length of 2nd array:");
		int m=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		
		System.out.println("Enter the array elements of 1st array:");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the array elements of 2nd array:");
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=sc.nextInt();
		}
		int mergedArray[]=merge(arr1, arr2);
		System.out.println("Merged Array:");
		for(int num:mergedArray) {
			System.out.print(num+" ");
		}
		sc.close();
	}

}
