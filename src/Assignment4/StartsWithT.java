package Assignment4;

import java.util.Scanner;

public class StartsWithT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length:");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().toLowerCase();
		}
		System.out.println("Enter the element to be searched:");
		char searchChar=sc.next().toLowerCase().charAt(0);
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i];
			if(!s1.isEmpty() && s1.charAt(0)==searchChar) {
				System.out.println("String:"+s1+" at position:"+(i+1));
				found=true;
			}
		}
		if(!found) {
			System.out.println("No String found starting with"+searchChar+" ");
		}
	}
}
