package Assignment4;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a=0, b=0;
		char s;
		double c;
		do {
			System.out.println("Enter the sum:");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			n=sc.nextInt();
			if(n>0&&n<5) {
				System.out.println("Enter the value of a:");
				a=sc.nextInt();
				System.out.println("Enter the value of b:");
				b=sc.nextInt();
			}
			switch(n) {
			case 1:c=a+b;
			System.out.println(c);
			break;
			case 2:c=a-b;
			System.out.println(c);
			break;
			case 3:c=a*b;
			System.out.println(c);
			break;
			case 4:c=a/b;
			System.out.println(c);
			break;
			default: System.out.println("Invali input!!!");
			}
			do {
			System.out.println("Do you want to continue?");
			System.out.println("Enter Y to continue N to exit");
			s=sc.next().toLowerCase().charAt(0);
			if(s!='y' && s!='n') {
				System.out.println("Invalid Input!!!");
			}
			}while(s!='y'&& s!='n');
		}while(s=='y');
		System.out.println("Thank you visit again");
		sc.close();
	}
}
