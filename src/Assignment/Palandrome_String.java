package Assignment;

import java.util.Scanner;

public class Palandrome_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		String s=sc.next();
		s=s.toLowerCase();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("Palandrome");
		}else {
			System.out.println("Not a Palandrome.");
		}
		sc.close();
	}

}
