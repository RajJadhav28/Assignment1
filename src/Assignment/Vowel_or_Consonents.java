package Assignment;

import java.util.Scanner;

public class Vowel_or_Consonents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input the character: ");  
		String s=sc.next(); 
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println("Vowels:"+s.charAt(i));
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
				System.out.println("Consonents:"+s.charAt(i));
			}
		}
		
	}
	}


