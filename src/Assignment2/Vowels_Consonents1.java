package Assignment2;

import java.util.Scanner;

public class Vowels_Consonents1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		System.out.println("Vowels:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(s.charAt(i));
			}
		}
		System.out.println("Consonents:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				System.out.println(s.charAt(i));
			}
		}
		sc.close();
	}
}
