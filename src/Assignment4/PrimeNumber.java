package Assignment4;

import java.util.Scanner;

class prime{
	int flag=0;
	public void prime(int num) {
		if(num==0 || num==1) {
			System.out.println("not a prime number");
			return;
		}else {
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("Prime number.");
		}
	}
}
public class PrimeNumber {
	public static void main(String[] args) {
		prime obj=new prime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		obj.prime(num);
		
	}
}
