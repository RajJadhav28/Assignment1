package Assignment5;

import java.util.Scanner;

public class largestElement {
	public static int largest(int arr[]) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		largestElement obj=new largestElement();
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int result=largestElement.largest(arr);
		System.out.println("Largest element:"+result);
		sc.close();
	}
}
