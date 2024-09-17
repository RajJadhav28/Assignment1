package Assignment;

import java.util.Scanner;

public class Alphabet_or_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the value:");
		char ch=sc.next().charAt(0);
		if(Character.isLetter(ch)){
			System.out.println(ch+" is a character");
		}else {
			System.out.println(ch+"is not a character");
		}
		}catch(Exception e) {
			System.out.println("Invalid input!!!");
		}
		sc.close();
	}

}
