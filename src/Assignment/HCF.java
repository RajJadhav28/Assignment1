package Assignment;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0&&m%i==0) {
				k=i;
				
			}
		}
		System.out.println("Highest common factor:"+k);
		sc.close();
	}

}
