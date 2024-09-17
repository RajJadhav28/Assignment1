package Assignment;

import java.util.Scanner;

public class Vowel_or_consonents1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the value:");
			char ch=sc.next().toLowerCase().charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch+" is a vowel");
			}else if(ch>='a'&&ch<='z'){
				System.out.println(ch+" is a consonent");
			}else {
				System.out.println("Invalid input!!");
			}
			
		}catch(Exception e) {
			System.out.println("Invalid input!!!");
		}
		sc.close();
		}

}
