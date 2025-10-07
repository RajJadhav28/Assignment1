package Assignment4;

import java.util.Scanner;

class addArray {
	public int add(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
}
public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		addArray obj=new addArray();
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int result=obj.add(arr);
		System.out.println("Sum of length of array:"+result);
		sc.close();
	}
}
