package Assignment;

import java.util.Scanner;

public class Infinite_LoopWhile2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int c=0;
		while(true) {
			System.out.println("Number:"+n);
			c++;
		}
		
//		Infinite loop using for loop
//		public class InfiniteLoopWithCondition {
//
//		    public static void main(String[] args) {
//		        for (int i = 0; i >= 0; i++) {
//		            System.out.println("This is an infinite loop with i = " + i);
//		        }
//		    }
//		}

	}
}
