package Assignment2;

import java.util.Scanner;

public class Largest_element1 {
	public static int largest(int total, int arr[]) {
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				second_largest=largest;
				largest=arr[i];
			}else if(arr[i]>second_largest && arr[i]!=largest) {
				second_largest=arr[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total:");
		int total=sc.nextInt();
		int arr[]=new int[total];
		System.out.println("Enter the array elements:");
		for(int i=0;i<total;i++) {
			arr[i]=sc.nextInt();
		}
		int result=largest(total, arr);
		System.out.println(result);
	}
}
