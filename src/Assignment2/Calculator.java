package Assignment2;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a=0, b=0;
		double c;
		char x;
		do {
			System.out.println("Enter the sum you want to perform:");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			
			
			n=sc.nextInt();
			if(n>=1&&n<5) {
				System.out.println("Enter the 1st value:");
				a=sc.nextInt();
				System.out.println("Enter the 2nd value");
				b=sc.nextInt();
			}
			switch(n) {
			case 1:c=a+b;
			System.out.println("Addition:"+c);
			break;
			
			case 2:c=a-b;
			System.out.println("Subtraction:"+c);
			break;
			
			case 3:c=a*b;
			System.out.println("Multiplication:"+c);
			break;
			
			case 4:c=a/b;
			System.out.println("Division:"+c);
			break;
			
			default:System.out.println("Invalid Input...");
			
			}
			do {
				System.out.println("Enter do you want to continue:\nEnter Y to continue N to exit");
				x=sc.next().toLowerCase().charAt(0);
				if(x!='y' && x!='n') {
					System.out.println("Invalid input!!!");
				}
			}while(x!='y' && x!='n');
		}while(x=='y');
		System.out.println("Thank you!!!");
	}
}
