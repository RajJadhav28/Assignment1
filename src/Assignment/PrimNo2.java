package Assignment;

import java.util.Scanner;

public class PrimNo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();int c;
		for(int i=1;i<=n;i++) {
			c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
				c++;
			}
		}
			if(c==2) {
				System.out.println("Prime no."+i);
			}
	}
}

}
