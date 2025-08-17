package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int s=sc.nextInt();
		int[] arr=new int[s];
		System.out.println("Enter the array elements:");
		int temp;
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Ascending order:");
		
//		for(int i=0;i<s;i++) {
//			for(int j=i+1;j<s;j++) {
//				if(arr[i]>arr[j]) {
//				
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//				
//			}
			for(int i=0;i<s;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}

