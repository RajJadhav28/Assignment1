package Assignment;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the marks of Physics:");
		double p=sc.nextDouble();
		System.out.println("Enter the marks of Chemistry:");
		double c=sc.nextDouble();
		System.out.println("Enter the marks of Biology:");
		double b=sc.nextDouble();
		System.out.println("Enter the marks of Mathematics:");
		double m=sc.nextDouble();
		System.out.println("Enter the marks of computer:");
		double c1=sc.nextDouble();
		double per=((p+c+b+m+c1)/500)*100;
		System.out.println("Percentage:"+per+"%.");
		if(per<=100&&per>=90) {
			System.out.println("Grade:A+");
		}else if(per<=90&&per>=80) {
			System.out.println("Grade:A");
		}else if(per<=80&&per>=70) {
			System.out.println("Grade:B+");
		}else if(per<=70&&per>=60) {
			System.out.println("Grade:B");
		}else if(per<=60&&per>=55) {
			System.out.println("Grade:C+");
		}else if(per<=55&&per>=50) {
			System.out.println("Grade:C");
		}else if(per<=50&&per>=45) {
			System.out.println("Grade:D+");
		}else if(per<=45&&per>=35){
			System.out.println("Grade:D");
		}else {
			System.out.println("Fail!!!");
		}
		sc.close();
		}catch(Exception e) {
			System.out.println("Invalid Input!!!");
		}
	}

}
