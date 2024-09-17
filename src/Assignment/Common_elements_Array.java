package Assignment;

import java.util.Scanner;

public class Common_elements_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int s1=sc.nextInt();
		int arr1[]=new int[s1];
		int arr2[]=new int[s1];
		System.out.println("Enter the elements of 1st array:");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
			}
		System.out.println("Enter the elements of 2nd array:");
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=sc.nextInt();
			}
		int k=0;
		System.out.println("Common elements in the array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					k++;
					System.out.println(arr1[i]);
				}
			}
		}
		System.out.println("No.of common elements:"+k);
		sc.close();
	}

}
