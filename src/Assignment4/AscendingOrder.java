package Assignment4;

import java.util.Scanner;

class ascending{
	public int[] asc(int arr[]) {
		int i,j;
		for(i=0;i<arr.length;i++) {
			for( j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
public class AscendingOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ascending obj=new ascending();
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter tha array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int result[]=obj.asc(arr);
		for(int result1:result) {
			System.out.print(result1+" ");
		}
		sc.close();
	}
	
}
