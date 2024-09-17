package Assignment;

import java.util.Scanner;

public class Largest_element_array {
	public static int largest(int a[], int total) {
		Scanner sc=new Scanner(System.in);
		int temp;
		System.out.println("Enter the array elements:");
		for(int i=0;i<total;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-1];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int total=sc.nextInt();
		
		int a[]=new int[total];
		System.out.println("Largest elemet in the array:"+largest(a, total));
	}

}
