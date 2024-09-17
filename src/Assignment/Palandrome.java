package Assignment;

import java.util.Scanner;

public class Palandrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is a palandrome number");
		}else {
			System.out.println(temp+" is not a palandrome number");
		}
		sc.close();
	}

}
