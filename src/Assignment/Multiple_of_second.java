package Assignment;

import java.util.Scanner;

public class Multiple_of_second {
	public static int multiple(int a, int b) {
		if(a*a==b) {
			System.out.println("a is multiple of b");
			System.out.println("a:"+a+"* a:"+a+"="+b);
			
		}else {
			System.out.println("a is not a multiple of b");
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		Multiple_of_second obj=new Multiple_of_second();
		obj.multiple(a, b);
		
	}

}
