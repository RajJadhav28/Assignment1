package Assignment4;

import java.util.Scanner;

class Largest{
	public int largest(int arr[]) {
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
}
public class LargestElement1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Largest obj=new Largest();
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int result=obj.largest(arr);
		System.out.println("Largest element:"+result);
		sc.close();
	}
}
