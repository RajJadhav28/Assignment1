package Assignment;

import java.util.Scanner;

public class Uppercase_or_lowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the value:");
			char ch=sc.next().charAt(0);
			if(Character.isLowerCase(ch)) {
				System.out.println(ch+" is a lowercase character.");
			}else if(Character.isUpperCase(ch)) {
				System.out.println(ch+" is a uppercase character.");
			}else {
				System.out.println("Invalid character"+ch);
			}
		}catch(Exception e) {
			System.out.println("Invalid Input!!!");
		}
		sc.close();
	}

}
