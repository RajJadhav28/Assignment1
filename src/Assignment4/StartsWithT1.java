package Assignment4;

import java.util.Scanner;

public class StartsWithT1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]= {"Mango","Grapes","Pineapple","Orange","Guava"};
		boolean found=true;
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i];
			if(!s1.isEmpty()&&s1.charAt(0)=='G') {
				System.out.println("found at position:"+(i+1));
				found=true;
			}
		}
		if(found==false) {
			System.out.println("No element found");
		}
	}
}
