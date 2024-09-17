package Assignment;

import java.util.Scanner;

public class Palandrome2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();int sum=0,rem,temp;
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		System.out.println("Reverse of number "+temp+":"+sum);
		if(temp==sum) {
			System.out.println("Entered number "+temp+" is equal to reverse "+sum);
			System.out.println(sum+" is a palandrome.");
		}else {
			System.out.println("Entered number "+temp+" is not equal to reverse "+sum);
			System.out.println(sum+" is not a palandrome.");
		}
		sc.close();
	}

}
