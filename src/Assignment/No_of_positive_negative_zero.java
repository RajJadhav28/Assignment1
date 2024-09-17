package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class No_of_positive_negative_zero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,x,p=0,n1=0,z=0;
		ArrayList<Integer> positive=new ArrayList<Integer>();
		ArrayList<Integer> negative=new ArrayList<Integer>();
		do {
			System.out.println("Enter the number:");
			n=sc.nextInt();
				if(n>0) {
					System.out.println("Positive number:"+n);
					p++;
					Integer x1=n;
					positive.add(x1);
					
				} else if(n<0){
					System.out.println("Negative number:"+n);
					n1++;
					Integer x2=n;
					negative.add(x2);
					
				}else if(n==0){
					System.out.println("Zero:"+n);
					z++;
	
				}else {
					System.out.println("Invalid number.");
				}
			
			System.out.println("Do you want to continue");
			System.out.println("Enter 1 to continue or enter 2 to discontinue or show result.");
			x=sc.nextInt();
			
		}while(x==1);
		System.out.println("No.of positive numbers:"+p);
		System.out.println("Positive numbers:"+positive);
		System.out.println("No.of negative numbers:"+n1);
		System.out.println("Negative numbers:"+negative);
		System.out.println("No.of Zeros:"+z);
		sc.close();
	}

}
