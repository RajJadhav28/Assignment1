package Assignment;

import java.util.Scanner;

public class Divisible_5_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the value:");
			double n=sc.nextDouble();
			if(n%5==0&&n%11==0) {
				System.out.println(n+" is divisible by 5 &11");
			}else {
				System.out.println(n+" is not divisible bt 5 & 11");
			}
		}catch(Exception e) {
			System.out.println("Invalid Input!!!");
		}
		sc.close();
	}

}
