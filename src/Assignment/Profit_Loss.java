package Assignment;

import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost:");
		double c=sc.nextDouble();
		System.out.println("Enter the selling price:");
		double s=sc.nextDouble();
		if(s>c) {
			double d=s-c;
			System.out.println("Profit generated:"+d);
		}else if(c>s) {
			double d=c-s;
			System.out.println("Loss:"+d);
		}else {
			System.out.println("No Profit No Loss!!!");
		}
		sc.close();
	}

}
