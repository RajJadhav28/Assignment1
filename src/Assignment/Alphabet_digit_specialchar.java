package Assignment;

import java.util.Scanner;

public class Alphabet_digit_specialchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the value:");
		char ch=sc.next().charAt(0);
		if(Character.isLetter(ch)) {
			System.out.println(ch+" is an alphabet");
		}else if(Character.isDigit(ch)) {
			System.out.println(ch+" is a digit");
		}else {
			System.out.println(ch+" is a special character");
		}
			
		}catch(Exception e) {
			System.out.println("Invalid Input!!!");
		}
		sc.close();
	}

}
