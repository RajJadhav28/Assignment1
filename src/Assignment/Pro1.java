package Assignment;

import java.util.Scanner;

public class Pro1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x ,n,a = 0,b = 0;
		double c;
		do {
		System.out.println("Enter the sum you want to perform.");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		n=sc.nextInt();
		if(n>=0&&n<5) {
			System.out.println("Enter the first number");
			a=sc.nextInt();
			System.out.println("Enter the second number:");
			 b=sc.nextInt();
		}
		switch(n) {
		case 1: c=a+b;
		System.out.println("Addition of "+a+"+"+b+":"+c);
		break;
		case 2:c=a-b;
		System.out.println("Subtraction of "+a+"-"+b+":"+c);
		break;
		case 3:c=a*b;
		System.out.println("Multiplication of "+a+"*"+b+":"+c);
		break;
		case 4:c=a/b;
		System.out.println("Division of "+a+"/"+b+":"+c);
		break;
		
		default:System.out.println("Invalid input!!!");
		}
		System.out.println("Do you want to continue");
		System.out.println("Enter 1 to continue and 2 to discontinue.");
		x=sc.nextInt();
		}while(x==1);
		System.out.println("Thank you!!!");

	}

}
