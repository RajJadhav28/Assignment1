package Assignment;

import java.util.Scanner;

public class Sum_of_even_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nSum of 1-"+n+":"+sum);
		sc.close();
		}

}
