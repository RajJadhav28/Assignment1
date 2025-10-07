package Assignment4;

import java.util.Scanner;

class strong{
	
	public static int factorial(int num) {
		int f=1;
		for(int i=1;i<num;i++) {
			f=f*i;
		}
		return f;
	}
	public  boolean isStrong(int num) {
		int sum=0;
		int temp=num;
		while(num>0) {
		int rem=num%10;
		sum=sum+factorial(rem);
		num=num/10;
		}
		return sum==temp;
	}
}
public class strongNumber1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		strong obj=new strong();
		System.out.println("Enter the number:");
		int num=sc.nextInt();
//		if(obj.isStrong(num)) {
//			System.out.println("strong number");
//		}else {
//			System.out.println("not strong");
//		}
		for(int i=1;i<=num;i++) {
			if(obj.isStrong(i)) {
				System.out.println(i);
			}
		}
		
		
	}
}
